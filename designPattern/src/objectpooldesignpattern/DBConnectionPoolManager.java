package objectpooldesignpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Sandeep Singh
 * Date: 11/02/25
 */

public class DBConnectionPoolManager {

    List<DBConnection> freeConnectionInPool = new ArrayList<>();
    List<DBConnection> connectionCurrentlyInUse = new ArrayList<>();
    int INITIAL_POOL_SIZE = 3;
    int MAX_POOL_SIZE = 6;
    private static DBConnectionPoolManager dbConnectionPoolManager = null;

    private DBConnectionPoolManager() {
        for (int i = 0; i < INITIAL_POOL_SIZE; i++) {
            freeConnectionInPool.add(new DBConnection());
        }
    }

    public static DBConnectionPoolManager getInstance() {
        if (dbConnectionPoolManager == null) {
            synchronized (DBConnectionPoolManager.class) {
                if (dbConnectionPoolManager == null) {
                    dbConnectionPoolManager = new DBConnectionPoolManager();
                }
            }
        }
        return dbConnectionPoolManager;
    }

    public synchronized DBConnection getDBConnection() {
        if (connectionCurrentlyInUse.size() < MAX_POOL_SIZE && freeConnectionInPool.isEmpty()) {
            freeConnectionInPool.add(new DBConnection());
            System.out.println("Creating New Connection And Putting into the Pool , Free Pool Size :: " + freeConnectionInPool.size());
        } else if (connectionCurrentlyInUse.size() >= MAX_POOL_SIZE && freeConnectionInPool.isEmpty()) {
            System.out.println("Can't Create a New DBConnection , as Max limit Reached");
            return null;
        }
        DBConnection dbConnection = freeConnectionInPool.remove(freeConnectionInPool.size() - 1);
        connectionCurrentlyInUse.add(dbConnection);
        System.out.println("Adding Db Connection into use Pool Size :: " + connectionCurrentlyInUse.size());
        return dbConnection;
    }

    public synchronized void releaseDBConnection(DBConnection dbConnection) {
        if (dbConnection != null) {
            connectionCurrentlyInUse.remove(dbConnection);
            System.out.println("Removing Db Connection from Use Pool, Size :  " + connectionCurrentlyInUse.size());
            freeConnectionInPool.add(dbConnection);
            System.out.println("Adding Db Connection into free Pool, Size : " + freeConnectionInPool.size());
        }
    }
}

package abstractfactordesignpattern.abstrcatfactoryproducer;

import abstractfactordesignpattern.abstractfactory.AbstractFactory;
import abstractfactordesignpattern.carimpl.EcnomicCarFactory;
import abstractfactordesignpattern.carimpl.LuxuryCarFactory;

/**
 * Author: Sandeep Singh
 * Date: 11/02/25
 */

public class AbstrcatFactoryProducer {


    public AbstractFactory getFactoryInstance(String value){
        if(value.equalsIgnoreCase("Economic")){
            return new EcnomicCarFactory();
        }else if (value.equalsIgnoreCase("Luxury") || value.equalsIgnoreCase("Premium")){
            return new LuxuryCarFactory();
        }
        return null;
    }

}

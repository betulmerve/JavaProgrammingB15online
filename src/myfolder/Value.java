package myfolder;

public class Value {

    boolean isSetValCalled=false;
    int lastPassed;
    boolean isOneArgConsUsed=false;

    public Value() {
    }
    public Value(int num){

        isOneArgConsUsed=true;
        lastPassed=num;
    }

    public void setVal(int num){
        isSetValCalled=true;
        lastPassed=num;
    }
    public boolean wasModified() {
        return isSetValCalled;
    }

    public int getVal() {
        if (wasModified()) {
            return lastPassed;
        } else if(isOneArgConsUsed) {
            return lastPassed;
        } else {
            return 0;
        }
    }
}


/*
Write a class definition of a class named 'Value' with the following:
a constructor accepting a single integer parameter
a constructor with no parameters
a method 'setVal' that accepts a single parameter,
a boolean method, 'wasModified' that returns true if setVal was ever called for the object.
a method 'getVal' that returns an integer value as follows:
if setVal has ever been called, it getVal returns the last value passed to setVal.
Otherwise if the "single int parameter" constructor was used to create the object,
getVal returns the value passed to that  constructor. Otherwise getVal returns 0.
 */


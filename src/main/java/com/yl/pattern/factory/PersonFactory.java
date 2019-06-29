package com.yl.pattern.factory;

import com.yl.pattern.common.CommonConst;

public class PersonFactory {

    public static IPerson createPerson(String sex) {
        if (CommonConst.PersonSex.MALE.equals(sex)) {
            return new Male();
        } else if (CommonConst.PersonSex.FEMALE.equals(sex)) {
            return new Female();
        } else {
            System.out.println("这种人可能目前不被大众接受，暂时不创造...");
            return null;
        }
    }

    public static void main(String[] args) {
        IPerson male = PersonFactory.createPerson(CommonConst.PersonSex.MALE);
        male.sayYourSex();
        IPerson female = PersonFactory.createPerson(CommonConst.PersonSex.FEMALE);
        female.sayYourSex();
    }
}

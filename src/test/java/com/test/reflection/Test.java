package com.test.reflection;

import java.lang.reflect.*;

class Test{
    @org.junit.jupiter.api.Test
    public void Reflectiontest() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
      Class studentClass=Class.forName("com.test.reflection.Student");

      Constructor studentClassConstructor=studentClass.getDeclaredConstructor(String.class);

      studentClassConstructor.setAccessible(true);

      Field studentAgeField=studentClass.getDeclaredField("studentAge");

      Method studentShowMethod=studentClass.getDeclaredMethod("show", String.class);

      studentShowMethod.setAccessible(true);


      Object student=studentClassConstructor.newInstance("David");

      studentAgeField.set(student,10);

      Object result=studentShowMethod.invoke(student,"message");
        System.out.println("result: " + result);
    }




}
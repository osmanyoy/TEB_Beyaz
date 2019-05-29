package com.teb.ee.batch;

import javax.batch.api.chunk.ItemProcessor;
import javax.inject.Named;

@Named("myprocessor")
public class MyItemProcessor implements ItemProcessor{

    @Override
    public EmployeeSecond processItem(Object item) throws Exception {
        String str = (String) item;
        String[] split = str.split(",");
        EmployeeSecond employee = new EmployeeSecond();
        employee.setName(split[0]);
        employee.setAge(Integer.parseInt(split[1]));
        return employee;
    }

}

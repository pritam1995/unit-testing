package com.example.unittesting.business.stub;

import com.example.unittesting.data.SomeDataService;

public class SomeDataServiceStub implements SomeDataService {
    @Override
    public int[] retrieveAllData() {
        return new int[]{1, 2, 3};
    }
}


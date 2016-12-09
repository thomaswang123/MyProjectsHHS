package com.chenyun.dao;

import com.chenyun.entity.AcessTest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by thomas.wang on 2016/12/9.
 */
public interface TestDao {
        ArrayList<AcessTest> findAll();
}

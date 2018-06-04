package com.fundrank.service;

import com.fundrank.model.FundRank;
import com.fundrank.model.Student;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * Created by user on 2018/1/8.
 */
public interface FundRankService {
    public PageInfo<FundRank> findPage(FundRank fundRank, int pageSize, int pageNo);


}

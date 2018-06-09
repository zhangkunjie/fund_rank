package com.fundrank.dao;

import com.fundrank.model.FundRank;
import com.fundrank.model.vo.FundRankVO;

import java.util.List;

public interface FundRankDao extends BaseDao<FundRankVO, Long> {
    List<FundRank> findFundRankPage(FundRankVO fundRankVO);
    /*int deleteByPrimaryKey(Long id);

    int insert(FundRank record);

    int insertSelective(FundRank record);

    FundRank selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FundRank record);

    int updateByPrimaryKey(FundRank record);*/
}
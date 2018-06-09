package com.fundrank.service.serviceimpl;

import com.fundrank.dao.FundRankDao;
import com.fundrank.dao.StudentDao;
import com.fundrank.model.FundRank;
import com.fundrank.model.Student;
import com.fundrank.model.vo.FundRankVO;
import com.fundrank.service.FundRankService;
import com.fundrank.service.StudentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by user on 2018/1/8.
 */
@Service
public class FundRankServiceImpl implements FundRankService {

    @Resource
    private FundRankDao fundRankDao;


    @Override
    /*
    分页查找
    * */
    public PageInfo<FundRank> findFundRankPage(FundRankVO fundRankVO, int pageNo, int pageSize) {
        PageHelper.startPage(pageNo, pageSize);
        List<FundRank> list = fundRankDao.findFundRankPage(fundRankVO);
        PageInfo<FundRank> pageInfo = new PageInfo<FundRank>(list);
        return pageInfo;
    }


}

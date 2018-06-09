package com.fundrank.controller;

import com.fundrank.common.utils.JsonCallBack;
import com.fundrank.model.FundRank;
import com.fundrank.model.Student;
import com.fundrank.model.vo.FundRankVO;
import com.fundrank.service.FundRankService;
import com.fundrank.service.StudentService;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


/**
 * Created by user on 2018/1/8.
 */
@Controller
@RequestMapping("/fundrank")
public class FundRankController {
    @Autowired
    private FundRankService fundRankService;
    private Logger logger = LoggerFactory.getLogger(FundRankController.class);


    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/findPage/{pageSize}/{pageNo}", method = RequestMethod.POST)
    public JsonCallBack findPage(@RequestBody FundRankVO fundRankVO,
                                  @PathVariable int pageSize,@PathVariable int pageNo) {
        logger.info("findPage called");
        JsonCallBack jsonCallBack = new JsonCallBack(true);
        Map<String, Object> pairs = jsonCallBack.getPairs();
        try {
            PageInfo<FundRank> pageInfo = fundRankService.findFundRankPage(fundRankVO, pageNo, pageSize);
            pairs.put("dat", pageInfo);
        } catch (Exception e) {
            jsonCallBack.setSuccess(false);
            jsonCallBack.setMessage(e.getMessage());
            logger.error(e.getMessage());
            e.printStackTrace();
        }
        return jsonCallBack;
    }

}

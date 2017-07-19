package com.mivim.data.dao;

import com.mivim.data.model.Billingaddress;
import com.mivim.data.model.BillingaddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BillingaddressMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table billingaddress
     *
     * @mbg.generated Tue Jul 18 16:00:44 IST 2017
     */
    long countByExample(BillingaddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table billingaddress
     *
     * @mbg.generated Tue Jul 18 16:00:44 IST 2017
     */
    int deleteByExample(BillingaddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table billingaddress
     *
     * @mbg.generated Tue Jul 18 16:00:44 IST 2017
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table billingaddress
     *
     * @mbg.generated Tue Jul 18 16:00:44 IST 2017
     */
    int insert(Billingaddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table billingaddress
     *
     * @mbg.generated Tue Jul 18 16:00:44 IST 2017
     */
    int insertSelective(Billingaddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table billingaddress
     *
     * @mbg.generated Tue Jul 18 16:00:44 IST 2017
     */
    List<Billingaddress> selectByExample(BillingaddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table billingaddress
     *
     * @mbg.generated Tue Jul 18 16:00:44 IST 2017
     */
    Billingaddress selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table billingaddress
     *
     * @mbg.generated Tue Jul 18 16:00:44 IST 2017
     */
    int updateByExampleSelective(@Param("record") Billingaddress record, @Param("example") BillingaddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table billingaddress
     *
     * @mbg.generated Tue Jul 18 16:00:44 IST 2017
     */
    int updateByExample(@Param("record") Billingaddress record, @Param("example") BillingaddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table billingaddress
     *
     * @mbg.generated Tue Jul 18 16:00:44 IST 2017
     */
    int updateByPrimaryKeySelective(Billingaddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table billingaddress
     *
     * @mbg.generated Tue Jul 18 16:00:44 IST 2017
     */
    int updateByPrimaryKey(Billingaddress record);
}
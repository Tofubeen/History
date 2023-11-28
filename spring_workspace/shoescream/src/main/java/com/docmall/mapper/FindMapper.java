package com.docmall.mapper;

import org.apache.ibatis.annotations.Param;

public interface FindMapper {


	String findIdCheck(String mbsp_name, String mbsp_email);



	String checkIdEmail(@Param("mbsp_id") String mbsp_id, @Param("mbsp_email") String mbsp_email);


}

package com.docmall.mapper;

import org.apache.ibatis.annotations.Param;

public interface FindMapper {


	String findIdCheck(@Param("mbsp_name")String mbsp_name, @Param("mbsp_email")String mbsp_email);



	String findPw(@Param("mbsp_id") String mbsp_id, @Param("mbsp_email") String mbsp_email);


}

package com.docmall.mapper;

import org.apache.ibatis.annotations.Param;

import com.docmall.domain.MemberVO;

public interface FindMapper {


	MemberVO findIdCheck(@Param("mbsp_name") String mbsp_name, @Param("mbsp_email") String mbsp_email );

}

package com.ggs.docker.service.impl;

import com.ggs.docker.entity.Member;
import com.ggs.docker.mapper.MemberMapper;
import com.ggs.docker.service.MemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author starbug
 * @since 2022-07-20
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService {

}

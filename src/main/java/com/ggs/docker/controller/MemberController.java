package com.ggs.docker.controller;

import com.ggs.docker.entity.Member;
import com.ggs.docker.entity.R;
import com.ggs.docker.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author starbug
 * @since 2022-07-20
 */
@RestController
@RequestMapping("/docker/member")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping("list")
    public R queryMemberList() {
        List<Member> memberList = memberService.list();
        return R.ok().data(memberList);
    }

    @GetMapping("/id/{id}")
    public R queryMemberList(@PathVariable("id") String id) {
        Member member = memberService.getById(id);
        return R.ok().data(member);
    }

}

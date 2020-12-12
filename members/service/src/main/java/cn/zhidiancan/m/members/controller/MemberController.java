package cn.zhidiancan.m.members.controller;

import cn.zhidiancan.member.models.Member;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.transform.Result;


@RestController
@RequestMapping("/member/")
public class MemberController {

    @PutMapping("save")
    public Result saveMember(Member member) {
        return null;
    }

    @PutMapping("list")
    public void listMembers() {

    }
}

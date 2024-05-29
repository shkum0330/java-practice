package map.ex2.member;

import java.util.HashMap;
import java.util.Map;

public class MemberRepository {

    private Map<String,Member> memberMap=new HashMap<>();

    public void save(Member member){
        memberMap.put(member.getId(),member);
    }

    public Member findById(String id){
        return memberMap.get(id);
    }
    public Member findByName(String name) {
        for(Member m:memberMap.values()){
            if(m.getName().equals(name)){
                return m;
            }
        }
        return null;
    }
    public void remove(String id){
        memberMap.remove(id);
    }
}

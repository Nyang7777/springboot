package com.ict.edu2.member.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// @Getter
// @Setter
// RqualsAndHashCode: final 이나 @NonNull인 필드값을 설정해준다
// @Getter, @Setter, @RequiredArgsConstructor, @ToString, @ RqualsAndHashCode를 한꺼번에 설정한다
@Data
// 인자가 없는 기본 생성자 자동 생성해준다
@NoArgsConstructor
// 모든 인자가 들어가 있는 생성자 자동 생성해준다
@AllArgsConstructor
public class VO {
    private String m_id, m_pw, m_name, m_age, m_reg;

}
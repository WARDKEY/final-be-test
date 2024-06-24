package com.knowget.knowgetbackend.domain.post.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostRequestDTO {
	private String joReqstNo; // 구인 신청 번호
	private String joRegistNo; // 구인 등록 번호
	private String cmpnyNm; // 회사 이름
	private String bsnsSumryCn; // 사업 요약 내용
	private String rcritJssfcCmmnCodeSe; // 모집 직종 코드
	private String jobcodeNm; // 모집 직종 이름
	private Integer rcritNmprCo; // 모집 인원 수
	private String acdmcrCmmnCodeSe; // 학력 코드
	private String acdmcrNm; // 학력 이름
	private String emplymStleCmmnCodeSe; // 고용 형태 코드
	private String emplymStleCmmnMm; // 고용 형태 이름
	private String workPararBassAdresCn; // 근무 예정지 주소
	private String subwayNm; // 인접 지하철역
	private String dtyCn; // 직무 내용
	private String careerCndCmmnCodeSe; // 경력 조건 코드
	private String careerCndNm; // 경력 조건 이름
	private String hopeWage; // 희망 급여
	private String retGrantsNm; // 퇴직금 구분
	private String workTimeNm; // 근무 시간
	private String workTmNm; // 근무 형태
	private String holidayNm; // 휴일
	private String weekWorkHr; // 주당 근무 시간
	private String joFeinsrSbscrbNm; // 4대 보험
	private String rceptClosNm; // 접수 마감일
	private String rceptMthIemNm; // 전형 장소
	private String modelMthNm; // 전형 방법
	private String rceptMthNm; // 접수 방법
	private String presentnPapersNm; // 제출 서류
	private String mngrNm; // 담당자 이름
	private String mngrPhonNo; // 담당자 전화번호
	private String mngrInsttNm; // 담당자 소속기관 이름
	private String bassAdresCn; // 기업 주소
	private String joSj; // 구인 제목
	private String joRegDt; // 등록일
	private String guiLn; // 모집 요강
	private String gu; // 근무지 구
	private String jobCode; // 변환된 직종 코드
}

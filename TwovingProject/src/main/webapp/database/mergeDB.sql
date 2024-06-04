CREATE TABLE admins
(
   adminid varchar(30) NOT NULL,
   pwd varchar(30) NOT NULL,
   name varchar(30) NOT NULL,
   phone varchar(30) NOT NULL,
   PRIMARY KEY (adminid)
);

insert into admins values('admin', 'admin', '관리자', '010-7777-7777');
insert into admins values('scott', '1234', '홍길동', '010-6400-6068');

select * from product where pseq=3

select *
from product 
order by 1 desc

drop table product;

CREATE TABLE `product` (
   `pseq`   int   NOT NULL AUTO_INCREMENT,
   `kind`   int   NOT NULL   ,
   `genre`   VARCHAR(45)   NOT NULL   ,
   `mainyn` char(1) NOT NULL DEFAULT 'N',
   `bestyn`   char(1)   NOT NULL   DEFAULT 'N',
   `newyn`   char(1)   NOT NULL   DEFAULT 'Y',
   `useyn`   char(1)   NOT NULL   DEFAULT 'Y',
   `title`   VARCHAR(100)   NOT NULL,
   `content`   VARCHAR(1000)   NOT NULL,
   `age`   VARCHAR(100)   NOT NULL,
   `count`   int   NOT NULL   DEFAULT 0,
   `year`   VARCHAR(100)   NOT NULL,
   `time`   VARCHAR(100)   NOT NULL,
   `image`   VARCHAR(100)   NOT NULL,
   `savefilename`   VARCHAR(100)   NOT NULL,
   `image2`   VARCHAR(100)   NOT NULL,
   `savefilename2`   VARCHAR(100)   NOT NULL,
   PRIMARY KEY (pseq)
);

/* KIND 라디오 버튼? (0시리즈 1영화) */
insert into product(kind, genre, mainyn, bestyn, newyn, useyn, title, content, age, count, year, time, image, savefilename, image2, savefilename2) 
values(1, '사극', 'Y', 'N', 'N', 'Y', '관상', '영화 관상 입니다', 12, 10,  '2024', '128분', 'facereaderMain.png', 'facereader.jpg', 'facereaderMain.png','facereader.jpg');

insert into product(kind, genre, mainyn, bestyn, newyn, useyn, title, content, age, count, year, time, image, savefilename, image2, savefilename2) 
values(1, '멜로', 'Y', 'N', 'N', 'Y', '파이란', '영화 파이란 입니다', 12, 10,  '2024', '128분', 'pyranMain.png', 'pyran.jpg', 'pyranMain.png','pyran.jpg');

insert into product(kind, genre, mainyn, bestyn, newyn, useyn, title, content, age, count, year, time, image, savefilename, image2, savefilename2) 
values(1, '액션', 'Y', 'N', 'N', 'Y', '매드맥스', '영화 매드맥스 입니다', 12, 10,  '2024', '128분', 'madmaxMain.png', 'madmax.jpg', 'madmaxMain.png','madmax.jpg');

insert into product(kind, genre, mainyn, bestyn, newyn, useyn, title, content, age, count, year, time, image, savefilename, image2, savefilename2) 
values(1, '히어로', 'Y', 'N', 'N', 'Y', '데드풀', '영화 데드풀 입니다', 12, 10,  '2024', '128분', 'deadpoolMain.png', 'deadpool.jpg', 'deadpoolMain.png','deadpool.jpg');

insert into product(kind, genre, mainyn, bestyn, newyn, useyn, title, content, age, count, year, time, image, savefilename, image2, savefilename2) 
values(1, '공포', 'Y', 'N', 'N', 'Y', ' 메건', '영화 메건 입니다', 12, 10,  '2024', '128분', 'meganMain.jpg', 'megan.jpg', 'meganMain.jpg','megan.jpg');

insert into product(kind, genre, mainyn, bestyn, newyn, useyn, title, content, age, count, year, time, image, savefilename, image2, savefilename2) 
values(1, '사극', 'Y', 'N', 'N', 'Y', '왕의 남자', '영화 왕의 남자 입니다', 12, 10,  '2024', '128분', 'kingsmanMain.png', 'kingsman.jpg', 'kingsmanMain.png','kingsman.jpg');





insert into product(kind, genre, mainyn, bestyn, newyn, useyn, title, content, age, count, year, time, image, savefilename, image2, savefilename2) 
values(1, '멜로', 'N', 'N', 'Y', 'Y', '건축학개론', '영화 건축학개론 입니다', 12, 10,  '2024', '128분', 'deadpoolMain.png', 'building.jpg', 'deadpoolMain.png','building.jpg');

insert into product(kind, genre, mainyn, bestyn, newyn, useyn, title, content, age, count, year, time, image, savefilename, image2, savefilename2) 
values(1, '스릴러', 'N', 'N', 'Y', 'Y', '아이덴티티', '영화 아이덴티티 입니다', 12, 10,  '2024', '128분', 'deadpoolMain.png', 'id.jpg', 'deadpoolMain.png','id.jpg');

insert into product(kind, genre, mainyn, bestyn, newyn, useyn, title, content, age, count, year, time, image, savefilename, image2, savefilename2) 
values(1, '스릴러', 'N', 'N', 'Y', 'Y', '그놈 목소리', '영화 그놈 목소리 입니다', 12, 10,  '2024', '128분', 'deadpoolMain.png', 'voice.jpg', 'deadpoolMain.png','voice.jpg');

insert into product(kind, genre, mainyn, bestyn, newyn, useyn, title, content, age, count, year, time, image, savefilename, image2, savefilename2) 
values(1, '스릴러', 'N', 'N', 'Y', 'Y', '추격자', '영화 추격자 입니다', 12, 10,  '2024', '128분', 'deadpoolMain.png', 'chaser.jpg', 'deadpoolMain.png','chaser.jpg');

insert into product(kind, genre, mainyn, bestyn, newyn, useyn, title, content, age, count, year, time, image, savefilename, image2, savefilename2) 
values(1, '공포', 'N', 'Y', 'N', 'Y', '인시디어스', '영화 인시디어스 입니다', 12, 10,  '2024', '128분', 'deadpoolMain.png', 'isds.jpg', 'deadpoolMain.png','isds.jpg');

insert into product(kind, genre, mainyn, bestyn, newyn, useyn, title, content, age, count, year, time, image, savefilename, image2, savefilename2) 
values(1, '히어로', 'N', 'Y', 'N', 'Y', '조 커', '영화 조커 입니다', 12, 10,  '2024', '128분', 'deadpoolMain.png', 'jocker.jpg', 'deadpoolMain.png','jocker.jpg');

insert into product(kind, genre, mainyn, bestyn, newyn, useyn, title, content, age, count, year, time, image, savefilename, image2, savefilename2) 
values(1, '액션', 'N', 'Y', 'N', 'Y', '러브레터', '영화 러브레터 입니다', 12, 10,  '2024', '128분', 'deadpoolMain.png', 'letter.jpg', 'deadpoolMain.png','letter.jpg');

insert into product(kind, genre, mainyn, bestyn, newyn, useyn, title, content, age, count, year, time, image, savefilename, image2, savefilename2) 
values(1, '히어로', 'N', 'Y', 'N', 'Y', '로 건', '영화 로건 입니다', 12, 10,  '2024', '128분', 'deadpoolMain.png', 'logan.jpg', 'deadpoolMain.png','logan.jpg');



insert into product(kind, genre, mainyn, bestyn, newyn, useyn, title, content, age, count, year, time, image, savefilename, image2, savefilename2) 
values(1, '코미디', 'N', 'N', 'N', 'Y', '극한직업', '영화 극한직업 입니다', 12, 10,  '2024', '128분', 'jobMain.png', 'job.jpg', 'jobMain.png','job.jpg');

insert into product(kind, genre, mainyn, bestyn, newyn, useyn, title, content, age, count, year, time, image, savefilename, image2, savefilename2) 
values(1, '코미디', 'N', 'N', 'N', 'Y', '가문의 영광', '영화 가문의 영광 입니다', 12, 10,  '2024', '128분', 'familyMain.png', 'family.jpg', 'familyMain.png','family.jpg');

insert into product(kind, genre, mainyn, bestyn, newyn, useyn, title, content, age, count, year, time, image, savefilename, image2, savefilename2) 
values(1, '코미디', 'N', 'N', 'N', 'Y', '투사부일체', '영화 투사부일체 입니다', 12, 10,  '2024', '128분', 'bossMain.png', 'boss.jpg', 'bossMain.png','boss.jpg');

insert into product(kind, genre, mainyn, bestyn, newyn, useyn, title, content, age, count, year, time, image, savefilename, image2, savefilename2) 
values(1, '사극', 'N', 'N', 'N', 'Y', '명량', '영화 명량 입니다', 12, 10,  '2024', '128분', 'bossMain.png', 'admiral.jpg', 'bossMain.png','admiral.jpg');

insert into product(kind, genre, mainyn, bestyn, newyn, useyn, title, content, age, count, year, time, image, savefilename, image2, savefilename2) 
values(1, '공포', 'N', 'N', 'N', 'Y', '컨져링', '영화 컨져링 입니다', 12, 10,  '2024', '128분', 'bossMain.png', 'cjr.jpg', 'bossMain.png','cjr.jpg');

insert into product(kind, genre, mainyn, bestyn, newyn, useyn, title, content, age, count, year, time, image, savefilename, image2, savefilename2) 
values(1, '범죄', 'N', 'N', 'N', 'Y', '타짜1', '영화 타짜1 입니다', 12, 10,  '2024', '128분', 'gambleMain.png', 'gamble1.jpg', 'gamble1.png','gamble1.jpg');

insert into product(kind, genre, mainyn, bestyn, newyn, useyn, title, content, age, count, year, time, image, savefilename, image2, savefilename2) 
values(1, '범죄', 'N', 'N', 'N', 'Y', '타짜2', '영화 타짜2 입니다', 12, 10,  '2024', '128분', 'gamble2Main.png', 'gamble2.jpg', 'gamble2.png','gamble2.jpg');

insert into product(kind, genre, mainyn, bestyn, newyn, useyn, title, content, age, count, year, time, image, savefilename, image2, savefilename2) 
values(1, '범죄', 'N', 'N', 'N', 'Y', '타짜3', '영화 타짜3 입니다', 12, 10,  '2024', '128분', 'gamble3Main.png', 'gamble3.jpg', 'gamble3.png','gamble3.jpg');

insert into product(kind, genre, mainyn, bestyn, newyn, useyn, title, content, age, count, year, time, image, savefilename, image2, savefilename2) 
values(1, '판타지', 'N', 'N', 'N', 'Y', '반지의제왕 1', '영화 반지의제왕 1 입니다', 12, 10,  '2024', '128분', 'ring1Main.png', 'ring1.jpg', 'ring1Main.png','ring1.jpg');

insert into product(kind, genre, mainyn, bestyn, newyn, useyn, title, content, age, count, year, time, image, savefilename, image2, savefilename2) 
values(1, '판타지', 'N', 'N', 'N', 'Y', '반지의제왕 2', '영화 반지의제왕 2 입니다', 12, 10,  '2024', '128분', 'ring2Main.png', 'ring2.jpg', 'ring2Main.png','ring2.jpg');

insert into product(kind, genre, mainyn, bestyn, newyn, useyn, title, content, age, count, year, time, image, savefilename, image2, savefilename2) 
values(1, '판타지', 'N', 'N', 'N', 'Y', '반지의제왕 3', '영화 반지의제왕 3 입니다', 12, 10,  '2024', '128분', 'ring3Main.png', 'ring3.jpg', 'ring3Main.png','ring3.jpg');

insert into product(kind, genre, mainyn, bestyn, newyn, useyn, title, content, age, count, year, time, image, savefilename, image2, savefilename2) 
values(1, '액션', 'N', 'N', 'N', 'Y', '미션임파서블', '영화 미션임파서블 입니다', 12, 10,  '2024', '128분', 'deadpoolMain.png', 'imp1.jpg', 'deadpoolMain.png','imp1.jpg');

insert into product(kind, genre, mainyn, bestyn, newyn, useyn, title, content, age, count, year, time, image, savefilename, image2, savefilename2) 
values(1, '액션', 'N', 'N', 'N', 'Y', '미션임파서블2', '영화 미션임파서블2 입니다', 12, 10,  '2024', '128분', 'deadpoolMain.png', 'imp2.jpg', 'deadpoolMain.png','imp2.jpg');

insert into product(kind, genre, mainyn, bestyn, newyn, useyn, title, content, age, count, year, time, image, savefilename, image2, savefilename2) 
values(1, '액션', 'N', 'N', 'N', 'Y', '미션임파서블3', '영화 미션임파서블3 입니다', 12, 10,  '2024', '128분', 'deadpoolMain.png', 'imp3.jpg', 'deadpoolMain.png','imp3.jpg');

insert into product(kind, genre, mainyn, bestyn, newyn, useyn, title, content, age, count, year, time, image, savefilename, image2, savefilename2) 
values(1, '애니메이션', 'N', 'N', 'N', 'Y', '쿵푸팬더1', '영화 쿵푸팬더1 입니다', 12, 10,  '2024', '128분', 'deadpoolMain.png', 'panda1.jpg', 'deadpoolMain.png','panda1.jpg');

insert into product(kind, genre, mainyn, bestyn, newyn, useyn, title, content, age, count, year, time, image, savefilename, image2, savefilename2) 
values(1, '애니메이션', 'N', 'N', 'N', 'Y', '쿵푸팬더2', '영화 쿵푸팬더2 입니다', 12, 10,  '2024', '128분', 'deadpoolMain.png', 'panda2.jpg', 'deadpoolMain.png','panda2.jpg');

insert into product(kind, genre, mainyn, bestyn, newyn, useyn, title, content, age, count, year, time, image, savefilename, image2, savefilename2) 
values(1, '애니메이션', 'N', 'N', 'N', 'Y', '쿵푸팬더3', '영화 쿵푸팬더3 입니다', 12, 10,  '2024', '128분', 'deadpoolMain.png', 'panda3.jpg', 'deadpoolMain.png','panda3.jpg');



select * from product

---------------------------------------------------------------------------------------------------------
drop table notice

select * from notice
select * from notice where title like concat('%', ?, '%') "
            + " order by nseq desc limit ? offset 
            
--NOTICE--
CREATE TABLE `twoving`.`notice` (
  `nseq` INT NOT NULL AUTO_INCREMENT,
  `userid` VARCHAR(45) NOT NULL,
  `title` VARCHAR(45) NOT NULL,
  `content` VARCHAR(1000) NOT NULL,
  `indate` DATETIME NOT NULL DEFAULT now(),
  `readcount` INT NOT NULL DEFAULT 0,
  `noticeyn`   char(1)   NOT NULL   DEFAULT 'N',
  PRIMARY KEY (`nseq`)
  )
--ENGINE = InnoDB
--DEFAULT CHARACTER SET = utf8mb4
--COLLATE = utf8mb4_0900_ai_ci;

select * from notice

insert into notice(userid, title, content) values('hong1', '제목입니다.', '내용입니다');
insert into notice(userid, title, content) values('hong2', '제목입니다.', '내용입니다');
insert into notice(userid, title, content) values('hong3', '제목입니다.', '내용입니다');
insert into notice(userid, title, content) values('hong4', '제목입니다.', '내용입니다');
insert into notice(userid, title, content) values('hong5', '제목입니다.', '내용입니다');
insert into notice(userid, title, content) values('hong6', '제목입니다.', '내용입니다');
insert into notice(userid, title, content) values('hong7', '제목입니다.', '내용입니다');
insert into notice(userid, title, content) values('hong8', '제목입니다.', '내용입니다');
insert into notice(userid, title, content) values('hong9', '제목입니다.', '내용입니다');
insert into notice(userid, title, content) values('hong10', '제목입니다.', '내용입니다');
insert into notice(userid, title, content) values('hong11', '제목입니다.', '내용입니다');
insert into notice(userid, title, content) values('hong12', '제목입니다.', '내용입니다');
----------------------------------------------------고객문의
select * from customerinquiry where ciseq =3 
drop table customerinquiry
CREATE TABLE `twoving`.`customerinquiry` (
  `ciseq` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `email` VARCHAR(100) NOT NULL,
  `phone` VARCHAR(45) NOT NULL,
  `inquirylist` VARCHAR(100) NOT NULL,
  `devicephone` VARCHAR(100) NULL,
  `devicemodelname` VARCHAR(100) NULL,
  `runenvironment` VARCHAR(45) NULL,
  `runplace` VARCHAR(45) NULL,
  `runtime1` VARCHAR(50) NULL,
  `runtime2` VARCHAR(50) NULL,
  `runcontent` VARCHAR(50) NULL,
  `inquirytitle` VARCHAR(50) NOT NULL,
  `inquirycontent` VARCHAR(1000) NOT NULL,
  `reply` VARCHAR(1000) NULL,
  `indate` DATETIME NOT NULL DEFAULT now(),
  PRIMARY KEY (`ciseq`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;

select * from customerinquiry
    
update customerinquiry set inquirylist="사이트이용", inquirytitle="야구볼때", indate="2024-06-02 10:38:24.0",
devicephone="아이폰", devicemodelname="아이폰10", runenvironment="와이파이",
reply=null where ciseq=5
insert into customerinquiry(name, email, phone, inquiryList, devicephone, devicemodelname, runtime1, runtime2, runcontent, inquirytitle, inquirycontent,reply)  
values('hong1', 'syh6917@naver.com', '010-1111-1111', '회원/로그인', 'PC', '윈도우11', '03:00', '07:00', '드라마', '안녕하세요', '드라마 관련 질문드립니다.','답.변');

insert into customerinquiry(name, email, phone, inquiryList, devicephone, devicemodelname, runtime1, runtime2, runcontent, inquirytitle, inquirycontent)  
values('hong1', 'syh6917@naver.com', '010-1111-1111', '회원/로그인', 'PC', '윈도우11', '03:00', '07:00', '드라마', '안녕하세요', '드라마 관련 질문드립니다.');

insert into customerinquiry(name, email, phone, inquiryList, devicephone, devicemodelname, runtime1, runtime2, runcontent, inquirytitle, inquirycontent, runenvironment,runplace)  
values('hong2', 'aaa1234@naver.com', '010-2222-3333', '환불/해지신청', '아이폰', '통신사3G', '01:00', '09:00', '드라마', '드라마 제목2', '드라마 문의2','와이파이','집');

insert into customerinquiry(name, email, phone, inquiryList, devicephone, devicemodelname, runtime1, runtime2, runcontent, inquirytitle, inquirycontent, runenvironment,runplace)  
values('hong2', 'aaa1234@naver.com', '010-2332-3333', '환불/해지신청', '아이폰', '통신사3G', '01:00', '09:00', '영화', '영화 제목2', '영화 문의2','와이파이','집');
--------------------------------------------------------------------------------------------------------
--faq
select * from faq

CREATE TABLE `twoving`.`faq` (
  `qseq` INT NOT NULL AUTO_INCREMENT,
  `inquirylist` VARCHAR(100) NOT NULL,
  `subject` VARCHAR(100) NOT NULL,
  `content` VARCHAR(10000) NOT NULL,
  `indate` DATETIME NOT NULL DEFAULT now(),
  PRIMARY KEY (`qseq`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;

insert into faq(inquirylist, subject, content) values('전체', '   
[기타] 티빙 고객센터 카카오 챗봇 및 실시간 채팅 상담 이용하기', '새롭게 바뀐 티빙 카카오 챗봇에서 궁금한 점을 빠르게 해결해 보세요. 
더욱 자세한 내용이 궁금하시다면 상담사 연결을 통해 실시간 채팅 상담 도 가능합니다. 

■ 티빙 카카오 챗봇 이용 안내 
① 카카오톡에서 TVING 검색 후 채널 추가 
② 티빙 카카오 챗봇에서 궁금한 내용 선택하여 손쉽게 이용 

■ 티빙 실시간 채팅 상담 이용 안내 
① 티빙 카카오 챗봇 문항에서 [상담사 연결] 선택 
② 상담사에게 궁금한 내용 직접 문의하여 상담 진행 

* 티빙 실시간 채팅 상담은 평일 09:00 ~ 17:00에 이용 가능합니다.');

insert into faq(inquirylist, subject, content) values('회원/로그인', '[로그인] 이용권이 있는 계정이 무엇인지 찾고 싶어요.', 
'유료 가입한 계정을 찾고 싶을 때,
아래 방법으로 계정을 찾으신 후 계정 유형을 선택하여 로그인하여 주시기 바랍니다.

■ 이용 계정 확인 방법
① 티빙 WEB/APP 접속
② [티빙 시작하기] 버튼 클릭
③ 가장 하단 [아이디 찾기] 클릭
④ 본인인증으로 찾기 → [본인인증하기] 클릭
⑤ 가입한 계정 ID들 안내
⑥ 계정 ID 옆 (유료)로 표기된 계정으로 로그인

※ 이메일로 찾기 시 확인되지 않으니, 반드시 본인인증으로 찾기로 이용 계정 확인해주세요.
※ SNS 회원은 해당 SNS 아이디가 아닌 티빙 가입 시 등록한 이메일을 알려드립니다.
※ 본인인증이 완료된 계정만 확인이 가능합니다.
※ 네이버플러스멤버십 이용권 계정은 본인인증찾기로 확인되지 않습니다.

보다 자세한 확인이 필요한 경우, [1:1 게시판 문의] 또는 [tving@cj.net]로 문의해 주시면 가입하신 계정 확인하여 답변드리겠습니다.');


insert into faq(inquirylist, subject, content) values('이용권/결제', 
'[변경] 정기결제수단 변경은 어떻게 하나요?', 

'결제수단 변경은 PC와 모바일웹에서 변경하실 수 있습니다.
변경 방법은 아래 경로를 확인해 주세요.

■ 결제수단 변경 방법
(모바일웹)
1. www.tving.com 접속 후 로그인
2. 우측 상단 [결제 수단] 클릭
3. 변경할 결제 정보 입력 후 완료

(PC)
1. www.tving.com 접속 후 로그인
2. 우측 상단 프로필 클릭
3. MY 버튼 클릭
4. 이용권/캐시 내역 메뉴 클릭
5. 결제 수단 항목의 [변경] 버튼 클릭
6. 변경할 결제 정보 입력 후 완료

※ 티빙 APP에서는 결제수단 변경이 어렵습니다.
※ 결제 수단은 신용카드, 네이버페이, 카카오페이, 토스페이로 변경할 수 있습니다.
※ 결제 수단 변경 시 다음 결제일부터 적용됩니다.
※ 결제 중인 휴대폰 결제를 타 결제 수단으로 변경하시는 경우, 더 이상 휴대폰 결제는 이용하실 수 없습니다.');

insert into faq(inquirylist, subject, content) values('재생/오류', 
'[플레이어] 콘텐츠 재생 중 화면 비율은 어떻게 변경하나요?', 
'콘텐츠 재생 중 화면 비율은 핀치 인/아웃 제스처로 변경할 수 있어요. 
* 꽉찬 화면으로 변경 : 전체 화면 모드에서 두 손가락으로 화면을 확대하듯이 늘려주세요. 
* 원본 비율로 변경 : 전체 화면 모드에서 두 손가락으로 화면을 축소하듯이 모아주세요.');

insert into faq(inquirylist, subject, content) values('해지/환불', 
'[해지] 정기결제 해지가 무엇인가요?',
'정기결제 해지란 티빙에서 구독중인 이용권의 정기 자동 결제를 중단하는 것을 말합니다. 
정기결제 해지 시 다음 회차부터 결제가 중단되며, 현재 이용중인 회차는 이용권 만료일까지 이용 가능합니다. 
정기결제 해지는 아래의 방법으로 신청 가능하시오니 이용에 참고 부탁드립니다. 
■ 정기결제 해지 방법 
- PC WEB : www.tving.com > 로그인 > MY > 나의 이용권 > 이용권 클릭 > ‘변경/해지’ 버튼 클릭하여 해지 
- Mobile APP : TVING APP > 로그인 > MY > 나의 이용권 > 이용권 클릭 > ‘정기결제 해지하기’ 버튼 클릭하여 해지 
* 구글/애플 인앱결제로 구독하신 이용권은 각 스토어로 구독취소 신청하셔야 구독해지가 가능합니다. 
* 네이버/통신사 등 제휴처 상품을 이용 중인 경우 각 제휴처로 문의가 필요합니다. '
);

drop table member;



ALTER TABLE member modify phone varchar(45) 


CREATE TABLE member
(
   userid varchar(45) NOT NULL,
   pwd varchar(45) NOT NULL,
   name varchar(45) NOT NULL,
   phone varchar(45),
   email varchar(100) NOT NULL,
   indate datetime DEFAULT now() NOT NULL,
   useyn char(1) DEFAULT 'Y' NOT NULL,
   PRIMARY KEY (userid)
);


insert into member(userid, pwd, name, phone, email)
values('one','1111','김나리','017-777-7777','acc@abc.com');
insert into member(userid, pwd, name, phone, email)
values('two','2222','김길동','011-032-7777','aac@abc.com');


drop table steamed;

CREATE TABLE `steamed` (
	`sseq`	int	NOT NULL AUTO_INCREMENT,	
	`pseq`	int	NOT NULL,
	`userid`	VARCHAR(45)	NOT NULL,
	`indate`	DATETIME	NOT NULL	DEFAULT now(),
	PRIMARY KEY (sseq)
);


ALTER TABLE `steamed` ADD CONSTRAINT `FK_product_TO_steamed_1` 
FOREIGN KEY (`pseq`)
REFERENCES `product` (`pseq`)
ON UPDATE RESTRICT
ON DELETE RESTRICT;


select* from member;

select* from payment;


-- 메인화면 컨텐츠
create or replace view main_pro_view
as
select pseq, title, image, kind, genre, age, time, year, content, savefilename from product where mainyn='Y' order by pseq desc limit 6;

-- 새로운 컨텐츠 
create or replace view new_pro_view
as
select pseq, title, image, kind, genre, age, time, year, content, savefilename from product where newyn='Y' order by pseq desc limit 4;

-- 베스트 컨텐츠
create or replace view best_pro_view
as
select pseq, title, image, kind, genre, age, time, year, content, savefilename from product where bestyn='Y' order by pseq desc limit 4;

--찜목록
create or replace view steamed_view
as
select s.sseq, s.userid, m.name, p.pseq, p.savefilename from steamed s, product p, member m
where s.pseq=p.pseq and s.userid=m.userid;

select * from steamed_view;






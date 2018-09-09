package com.example.chen.rxjavatest.entity;

import java.util.List;

/**
 * Created by chen on 2018/9/8.
 */
public class NewsBean {

    /**
     * reason : 成功的返回
     * result : {"stat":"1","data":[{"uniquekey":"9d043389e5f1629592a0e10ac2d8f096","title":"这些国家刚和台湾\u201c断交\u201d，美国召回大使","date":"2018-09-08 15:54","category":"头条","author_name":"人民网app","url":"http://mini.eastday.com/mobile/180908155443916.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20180908/20180908155443_52d7f39c7a86346d27b525bae3eb1253_1_mwpm_03200403.jpg"},{"uniquekey":"0282e2608bd27d75d0963df54f1aa886","title":"真人不露相，非常低调，越相处越让人觉得厉害的星座","date":"2018-09-08 15:49","category":"头条","author_name":"半世情缘","url":"http://mini.eastday.com/mobile/180908154913571.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20180908/20180908_7f02dd6c9bc20a8068da1045aa029786_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20180908/20180908_c33fa4762f51628a63b9c1fc8e2c1cb0_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20180908/20180908_a578b204317b2b549dd7b8628c6c68f7_cover_mwpm_03200403.jpg"},{"uniquekey":"0646745f574ed33087da5861678ed7df","title":"美人计 | 杨幂之后，采花大盗我还能采采谁？","date":"2018-09-08 15:44","category":"头条","author_name":"时尚COSMO","url":"http://mini.eastday.com/mobile/180908154414678.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20180908/20180908154414_278bbd1a288df62bf761ebd3768136a5_12_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01imgmini.eastday.com/mobile/20180908/20180908154414_278bbd1a288df62bf761ebd3768136a5_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01imgmini.eastday.com/mobile/20180908/20180908154414_278bbd1a288df62bf761ebd3768136a5_11_mwpm_03200403.jpg"},{"uniquekey":"4d2ad716b470263816cd77e2bda9c252","title":"河北男子擦碰引纠纷，抡起椅子怒砸倒地女人！","date":"2018-09-08 15:39","category":"头条","author_name":"好诗焦点","url":"http://mini.eastday.com/mobile/180908153929295.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20180908/20180908_214e4ec5933c0f81eca14ffe91042ffd_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20180908/20180908_9956c56a3922aa612203eef6bba194f0_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20180908/20180908_3e61cd528f47f8ad537d145385c356a9_cover_mwpm_03200403.jpg"},{"uniquekey":"790f7b3dbad8f5acf0dd229d9c80bf27","title":"5种简单高效俯卧撑，让你的胸肌呼之欲出！","date":"2018-09-08 15:38","category":"头条","author_name":"六点半健身","url":"http://mini.eastday.com/mobile/180908153833613.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20180908/20180908153833_69a6a1041ba1b6aa27f54958f6fa6875_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20180908/20180908153833_69a6a1041ba1b6aa27f54958f6fa6875_9_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20180908/20180908153833_69a6a1041ba1b6aa27f54958f6fa6875_1_mwpm_03200403.jpg"},{"uniquekey":"72999dfd8ce5820bb1899867635e858b","title":"科宇创研（广州）生物科技有限公司 简介","date":"2018-09-08 15:37","category":"头条","author_name":"科宇创研","url":"http://mini.eastday.com/mobile/180908153747211.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20180908/20180908153747_ceb91fbfc37bd729dcd248b53385d564_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08imgmini.eastday.com/mobile/20180908/20180908153747_ceb91fbfc37bd729dcd248b53385d564_5_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08imgmini.eastday.com/mobile/20180908/20180908153747_ceb91fbfc37bd729dcd248b53385d564_2_mwpm_03200403.jpg"},{"uniquekey":"4120c544b3eb9dc9f2aaafaefa387e78","title":"中国男篮再次集结! 郭艾伦回归后暂无位置, 杜峰用0分先生首发","date":"2018-09-08 15:34","category":"头条","author_name":"体坛及时雨","url":"http://mini.eastday.com/mobile/180908153437689.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20180908/20180908153437_d41d8cd98f00b204e9800998ecf8427e_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20180908/20180908153437_d41d8cd98f00b204e9800998ecf8427e_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20180908/20180908153437_d41d8cd98f00b204e9800998ecf8427e_1_mwpm_03200403.jpg"},{"uniquekey":"b0b65887e7850298e1310b4914f321c2","title":"美俄新作战服均被 电池问题\u201c卡脖子\u201d","date":"2018-09-08 15:33","category":"头条","author_name":"新华网","url":"http://mini.eastday.com/mobile/180908153321942.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20180908/20180908153321_a0b3e61425c79f538ec808604b9c0d66_1_mwpm_03200403.jpg"},{"uniquekey":"a0112cda62c40e106586f968cb281830","title":"心理测试：你第一眼看到什么，秒测出你的感情洁癖","date":"2018-09-08 15:32","category":"头条","author_name":"心理测试酱","url":"http://mini.eastday.com/mobile/180908153227288.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20180908/20180908153227_d41d8cd98f00b204e9800998ecf8427e_1_mwpm_03200403.jpg"},{"uniquekey":"aea2ef6144ed96210707ded08aedabab","title":"节食减肥险致命，健身2年增重25公斤，排骨女孩变女神的逆袭之路！","date":"2018-09-08 15:30","category":"头条","author_name":"四川健身教练培训","url":"http://mini.eastday.com/mobile/180908153020607.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20180908/20180908153020_60a2762d38899234a40a297e96773ac2_12_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20180908/20180908153020_60a2762d38899234a40a297e96773ac2_9_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05imgmini.eastday.com/mobile/20180908/20180908153020_60a2762d38899234a40a297e96773ac2_5_mwpm_03200403.jpg"},{"uniquekey":"f1f287850afe82bf9b45b21e02a6c671","title":"河南最悲催的城市，名气不输于郑州洛阳，经济却全年倒数","date":"2018-09-08 15:29","category":"头条","author_name":"唯爱枕惊鸿啊","url":"http://mini.eastday.com/mobile/180908152954316.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20180908/20180908152954_3e4f15b73ff7c468798893022e7d92ae_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08imgmini.eastday.com/mobile/20180908/20180908152954_3e4f15b73ff7c468798893022e7d92ae_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08imgmini.eastday.com/mobile/20180908/20180908152954_3e4f15b73ff7c468798893022e7d92ae_2_mwpm_03200403.jpg"},{"uniquekey":"21f5fe1cdbcc4c32a974b18513f99911","title":"美国黄石超级火山危机升级！除了灾难性喷发，大地震或一触即发！","date":"2018-09-08 15:27","category":"头条","author_name":"妙招小姐姐","url":"http://mini.eastday.com/mobile/180908152713772.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20180908/20180908152713_d41d8cd98f00b204e9800998ecf8427e_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20180908/20180908152713_d41d8cd98f00b204e9800998ecf8427e_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20180908/20180908152713_d41d8cd98f00b204e9800998ecf8427e_1_mwpm_03200403.jpg"},{"uniquekey":"ab84943a1fcd5195e6939036d36d7782","title":"第四届\u201c一带一路\u201d女性论坛在上海举办","date":"2018-09-08 15:25","category":"头条","author_name":"北京时间","url":"http://mini.eastday.com/mobile/180908152507634.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20180908/20180908152507_98413c8b59dcac2d4de19a0802b8e434_7_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03imgmini.eastday.com/mobile/20180908/20180908152507_98413c8b59dcac2d4de19a0802b8e434_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03imgmini.eastday.com/mobile/20180908/20180908152507_98413c8b59dcac2d4de19a0802b8e434_2_mwpm_03200403.jpg"},{"uniquekey":"037d26d8e08630d38bbe751451d71be1","title":"36岁潘晓婷的实力依旧强，容颜依旧美丽，感情依旧还是一个人","date":"2018-09-08 15:24","category":"头条","author_name":"体育实时播","url":"http://mini.eastday.com/mobile/180908152453793.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20180908/20180908152453_ca217696dd50447571d0d91a2b99e96d_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03imgmini.eastday.com/mobile/20180908/20180908152453_ca217696dd50447571d0d91a2b99e96d_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03imgmini.eastday.com/mobile/20180908/20180908152453_ca217696dd50447571d0d91a2b99e96d_2_mwpm_03200403.jpg"},{"uniquekey":"e3886580b245a1ac693bbf03d3d946dc","title":"农村有种野草，在民间价值很高，煮水可治脚气，人称\u201c鬼香油\u201d","date":"2018-09-08 15:24","category":"头条","author_name":"哆啰兵驿站","url":"http://mini.eastday.com/mobile/180908152433914.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20180908/20180908_a4288ccb696854a99ea8d328715d02bf_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20180908/20180908_92b070d96601de07725456ff49cfcf50_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05imgmini.eastday.com/mobile/20180908/20180908_76089c62641aa0abf70a9391fe2f5f69_cover_mwpm_03200403.jpg"},{"uniquekey":"b0bae4751e8137ac381211aa1f36b574","title":"女子花四万做水滴鼻，朋友说像哮天犬，医院：挺适合她的","date":"2018-09-08 15:22","category":"头条","author_name":"蜜爱小分队","url":"http://mini.eastday.com/mobile/180908152230356.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20180908/20180908152230_d41d8cd98f00b204e9800998ecf8427e_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20180908/20180908152230_d41d8cd98f00b204e9800998ecf8427e_5_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20180908/20180908152230_d41d8cd98f00b204e9800998ecf8427e_6_mwpm_03200403.jpg"},{"uniquekey":"f0669f0fd394d2e8e4b269c318897624","title":"主攻段放跟实力老将姚迪 在国家队里还有出头的日子吗","date":"2018-09-08 15:22","category":"头条","author_name":"最爱切尔西","url":"http://mini.eastday.com/mobile/180908152227995.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20180908/20180908152227_fd0c40d06d9aecc52baadc5e803624c1_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01imgmini.eastday.com/mobile/20180908/20180908152227_fd0c40d06d9aecc52baadc5e803624c1_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01imgmini.eastday.com/mobile/20180908/20180908152227_fd0c40d06d9aecc52baadc5e803624c1_3_mwpm_03200403.jpg"},{"uniquekey":"d91d321878f6a1c4bfa49832bb869a13","title":"王者荣耀：天美最应该采纳的6款皮肤设计，最后一个实在太美了！","date":"2018-09-08 15:21","category":"头条","author_name":"王者时刻","url":"http://mini.eastday.com/mobile/180908152144711.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20180908/20180908152144_d41d8cd98f00b204e9800998ecf8427e_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20180908/20180908152144_d41d8cd98f00b204e9800998ecf8427e_5_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02imgmini.eastday.com/mobile/20180908/20180908152144_d41d8cd98f00b204e9800998ecf8427e_2_mwpm_03200403.jpg"},{"uniquekey":"8c60bfa44037ff585e2ed3984bb5f4f6","title":"美网德约3-0轻取锦织圭进入决赛 有望争夺男单冠军","date":"2018-09-08 15:20","category":"头条","author_name":"吃怪兽的小兔几","url":"http://mini.eastday.com/mobile/180908152054047.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20180908/20180908152054_45fbd8262fe430de3eaf6fdc61a42d64_7_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20180908/20180908152054_45fbd8262fe430de3eaf6fdc61a42d64_9_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20180908/20180908152054_45fbd8262fe430de3eaf6fdc61a42d64_3_mwpm_03200403.jpg"},{"uniquekey":"c293d0c547929de8b2194cdac1103394","title":"美国姑娘第一次来中国，凌晨出门后被震撼：中国实在太安全了！","date":"2018-09-08 15:19","category":"头条","author_name":"留住最美的瞬间","url":"http://mini.eastday.com/mobile/180908151938220.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20180908/20180908151938_c58edf8583c9ec472da82b01f4cdba51_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08imgmini.eastday.com/mobile/20180908/20180908151938_c58edf8583c9ec472da82b01f4cdba51_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08imgmini.eastday.com/mobile/20180908/20180908151938_c58edf8583c9ec472da82b01f4cdba51_3_mwpm_03200403.jpg"},{"uniquekey":"0fd80232b69de1223f9f8eb9cd200170","title":"【执法实录】\u201c两快\u201d整治进行时，徐汇交警\u201c零容忍\u201d","date":"2018-09-08 15:18","category":"头条","author_name":"警民直通车徐汇站","url":"http://mini.eastday.com/mobile/180908151832763.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20180908/20180908151832_d41d8cd98f00b204e9800998ecf8427e_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08imgmini.eastday.com/mobile/20180908/20180908151832_d41d8cd98f00b204e9800998ecf8427e_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08imgmini.eastday.com/mobile/20180908/20180908151832_d41d8cd98f00b204e9800998ecf8427e_6_mwpm_03200403.jpg"},{"uniquekey":"5e24bd07dc204e8ab3aab72c361117d5","title":"搞笑：二哈你们一家这车开出来很拉风啊，回头率十足啊","date":"2018-09-08 15:18","category":"头条","author_name":"小雨刊物","url":"http://mini.eastday.com/mobile/180908151811905.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20180908/20180908151811_94c0b633160cb6e511bea0d1ab6459dc_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20180908/20180908151811_94c0b633160cb6e511bea0d1ab6459dc_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20180908/20180908151811_94c0b633160cb6e511bea0d1ab6459dc_4_mwpm_03200403.jpg"},{"uniquekey":"72da1b957fbec442393a2174117be950","title":"杨紫 又一波时尚\u201c暴击\u201d, 杨紫 芭莎慈善夜穿搭也太好看了吧！","date":"2018-09-08 15:18","category":"头条","author_name":"塔种草日志","url":"http://mini.eastday.com/mobile/180908151802245.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20180908/20180908151802_d41d8cd98f00b204e9800998ecf8427e_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20180908/20180908151802_d41d8cd98f00b204e9800998ecf8427e_6_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20180908/20180908151802_d41d8cd98f00b204e9800998ecf8427e_1_mwpm_03200403.jpg"},{"uniquekey":"caee209c6301f01b7a834642522779c6","title":"和悦华玺-北京70年产权限竞房来袭-保利金地首开联合开发","date":"2018-09-08 15:17","category":"头条","author_name":"立意文化","url":"http://mini.eastday.com/mobile/180908151750196.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20180908/20180908151750_5891296c7ffca4621444bc8174107b56_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20180908/20180908151750_5891296c7ffca4621444bc8174107b56_2_mwpm_03200403.jpg"},{"uniquekey":"85825b2e51f3919d48af84d667a04d0c","title":"这几种\u201c水\u201d别丢了，浇花太好了，花草又长叶又开花，长势喜人","date":"2018-09-08 15:17","category":"头条","author_name":"小雅在阳台","url":"http://mini.eastday.com/mobile/180908151735569.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20180908/20180908151735_54ff90c6adc372d7bc101b57a8752516_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08imgmini.eastday.com/mobile/20180908/20180908151735_54ff90c6adc372d7bc101b57a8752516_8_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08imgmini.eastday.com/mobile/20180908/20180908151735_54ff90c6adc372d7bc101b57a8752516_5_mwpm_03200403.jpg"},{"uniquekey":"11470750997a74b0d958c5faea9a7697","title":"经常吃这1种鱼，对防癌、降血压十分有益，尤其适合高血压人群","date":"2018-09-08 15:17","category":"头条","author_name":"活力营养师","url":"http://mini.eastday.com/mobile/180908151712017.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20180908/20180908_c50c5472c5c283675a24f6dd6734490e_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08imgmini.eastday.com/mobile/20180908/20180908_13773424702e071ec481ad824c405c0a_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08imgmini.eastday.com/mobile/20180908/20180908_a42eaad4165860056051856c1daecd1b_mwpm_03200403.jpg"},{"uniquekey":"cc347da4c63646fc225b92b9f5f54ac4","title":"汇银解盘：9.8下周黄金不破1190多单翻身有望后市走势操作","date":"2018-09-08 15:16","category":"头条","author_name":"时尚搭潮流","url":"http://mini.eastday.com/mobile/180908151641334.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20180908/20180908_a2b48c30372675b29febc37d76cc07b6_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20180908/20180908_b4d768994754c0a9a22cbbbc60a09178_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20180908/20180908_e3ea2533d38e0e88d1a24d4aa2fde172_cover_mwpm_03200403.jpg"},{"uniquekey":"50a9b87ed45b6b5724a1f545377f9f2b","title":"美国警方：刘强东案仍在继续调查","date":"2018-09-08 15:15","category":"头条","author_name":"人民网","url":"http://mini.eastday.com/mobile/180908151501068.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20180908/20180908151501_c58826cda6e5613c523ff6d721144132_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01imgmini.eastday.com/mobile/20180908/20180908151501_c58826cda6e5613c523ff6d721144132_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01imgmini.eastday.com/mobile/20180908/20180908151501_c58826cda6e5613c523ff6d721144132_3_mwpm_03200403.jpg"},{"uniquekey":"c1500e13e3d30579725529b17727c216","title":"美军M1A2主战坦克装甲并不强大 曾在竞标中输给了德国豹2","date":"2018-09-08 15:14","category":"头条","author_name":"利刃军事","url":"http://mini.eastday.com/mobile/180908151436855.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20180908/20180908_62411c7924c5c9397a567fc6adece205_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20180908/20180908_929df7f5b6e0119439f559a91305435f_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20180908/20180908_79a2a84041ff9f0571c723f5b179c3d5_cover_mwpm_03200403.jpg"},{"uniquekey":"d2dba86b268fc4d6f5d3c100a74f4a10","title":"搞笑漫画：法海不懂爱？老司机开车了","date":"2018-09-08 15:13","category":"头条","author_name":"爆小漫","url":"http://mini.eastday.com/mobile/180908151321211.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20180908/20180908151321_44df1773e2c110264b7a70d69384ed50_6_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20180908/20180908151321_44df1773e2c110264b7a70d69384ed50_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20180908/20180908151321_44df1773e2c110264b7a70d69384ed50_5_mwpm_03200403.jpg"}]}
     * error_code : 0
     */

    private String reason;
    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        /**
         * stat : 1
         * data : [{"uniquekey":"9d043389e5f1629592a0e10ac2d8f096","title":"这些国家刚和台湾\u201c断交\u201d，美国召回大使","date":"2018-09-08 15:54","category":"头条","author_name":"人民网app","url":"http://mini.eastday.com/mobile/180908155443916.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20180908/20180908155443_52d7f39c7a86346d27b525bae3eb1253_1_mwpm_03200403.jpg"},{"uniquekey":"0282e2608bd27d75d0963df54f1aa886","title":"真人不露相，非常低调，越相处越让人觉得厉害的星座","date":"2018-09-08 15:49","category":"头条","author_name":"半世情缘","url":"http://mini.eastday.com/mobile/180908154913571.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20180908/20180908_7f02dd6c9bc20a8068da1045aa029786_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20180908/20180908_c33fa4762f51628a63b9c1fc8e2c1cb0_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20180908/20180908_a578b204317b2b549dd7b8628c6c68f7_cover_mwpm_03200403.jpg"},{"uniquekey":"0646745f574ed33087da5861678ed7df","title":"美人计 | 杨幂之后，采花大盗我还能采采谁？","date":"2018-09-08 15:44","category":"头条","author_name":"时尚COSMO","url":"http://mini.eastday.com/mobile/180908154414678.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20180908/20180908154414_278bbd1a288df62bf761ebd3768136a5_12_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01imgmini.eastday.com/mobile/20180908/20180908154414_278bbd1a288df62bf761ebd3768136a5_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01imgmini.eastday.com/mobile/20180908/20180908154414_278bbd1a288df62bf761ebd3768136a5_11_mwpm_03200403.jpg"},{"uniquekey":"4d2ad716b470263816cd77e2bda9c252","title":"河北男子擦碰引纠纷，抡起椅子怒砸倒地女人！","date":"2018-09-08 15:39","category":"头条","author_name":"好诗焦点","url":"http://mini.eastday.com/mobile/180908153929295.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20180908/20180908_214e4ec5933c0f81eca14ffe91042ffd_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20180908/20180908_9956c56a3922aa612203eef6bba194f0_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20180908/20180908_3e61cd528f47f8ad537d145385c356a9_cover_mwpm_03200403.jpg"},{"uniquekey":"790f7b3dbad8f5acf0dd229d9c80bf27","title":"5种简单高效俯卧撑，让你的胸肌呼之欲出！","date":"2018-09-08 15:38","category":"头条","author_name":"六点半健身","url":"http://mini.eastday.com/mobile/180908153833613.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20180908/20180908153833_69a6a1041ba1b6aa27f54958f6fa6875_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20180908/20180908153833_69a6a1041ba1b6aa27f54958f6fa6875_9_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20180908/20180908153833_69a6a1041ba1b6aa27f54958f6fa6875_1_mwpm_03200403.jpg"},{"uniquekey":"72999dfd8ce5820bb1899867635e858b","title":"科宇创研（广州）生物科技有限公司 简介","date":"2018-09-08 15:37","category":"头条","author_name":"科宇创研","url":"http://mini.eastday.com/mobile/180908153747211.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20180908/20180908153747_ceb91fbfc37bd729dcd248b53385d564_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08imgmini.eastday.com/mobile/20180908/20180908153747_ceb91fbfc37bd729dcd248b53385d564_5_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08imgmini.eastday.com/mobile/20180908/20180908153747_ceb91fbfc37bd729dcd248b53385d564_2_mwpm_03200403.jpg"},{"uniquekey":"4120c544b3eb9dc9f2aaafaefa387e78","title":"中国男篮再次集结! 郭艾伦回归后暂无位置, 杜峰用0分先生首发","date":"2018-09-08 15:34","category":"头条","author_name":"体坛及时雨","url":"http://mini.eastday.com/mobile/180908153437689.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20180908/20180908153437_d41d8cd98f00b204e9800998ecf8427e_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20180908/20180908153437_d41d8cd98f00b204e9800998ecf8427e_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20180908/20180908153437_d41d8cd98f00b204e9800998ecf8427e_1_mwpm_03200403.jpg"},{"uniquekey":"b0b65887e7850298e1310b4914f321c2","title":"美俄新作战服均被 电池问题\u201c卡脖子\u201d","date":"2018-09-08 15:33","category":"头条","author_name":"新华网","url":"http://mini.eastday.com/mobile/180908153321942.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20180908/20180908153321_a0b3e61425c79f538ec808604b9c0d66_1_mwpm_03200403.jpg"},{"uniquekey":"a0112cda62c40e106586f968cb281830","title":"心理测试：你第一眼看到什么，秒测出你的感情洁癖","date":"2018-09-08 15:32","category":"头条","author_name":"心理测试酱","url":"http://mini.eastday.com/mobile/180908153227288.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20180908/20180908153227_d41d8cd98f00b204e9800998ecf8427e_1_mwpm_03200403.jpg"},{"uniquekey":"aea2ef6144ed96210707ded08aedabab","title":"节食减肥险致命，健身2年增重25公斤，排骨女孩变女神的逆袭之路！","date":"2018-09-08 15:30","category":"头条","author_name":"四川健身教练培训","url":"http://mini.eastday.com/mobile/180908153020607.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20180908/20180908153020_60a2762d38899234a40a297e96773ac2_12_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20180908/20180908153020_60a2762d38899234a40a297e96773ac2_9_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05imgmini.eastday.com/mobile/20180908/20180908153020_60a2762d38899234a40a297e96773ac2_5_mwpm_03200403.jpg"},{"uniquekey":"f1f287850afe82bf9b45b21e02a6c671","title":"河南最悲催的城市，名气不输于郑州洛阳，经济却全年倒数","date":"2018-09-08 15:29","category":"头条","author_name":"唯爱枕惊鸿啊","url":"http://mini.eastday.com/mobile/180908152954316.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20180908/20180908152954_3e4f15b73ff7c468798893022e7d92ae_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08imgmini.eastday.com/mobile/20180908/20180908152954_3e4f15b73ff7c468798893022e7d92ae_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08imgmini.eastday.com/mobile/20180908/20180908152954_3e4f15b73ff7c468798893022e7d92ae_2_mwpm_03200403.jpg"},{"uniquekey":"21f5fe1cdbcc4c32a974b18513f99911","title":"美国黄石超级火山危机升级！除了灾难性喷发，大地震或一触即发！","date":"2018-09-08 15:27","category":"头条","author_name":"妙招小姐姐","url":"http://mini.eastday.com/mobile/180908152713772.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20180908/20180908152713_d41d8cd98f00b204e9800998ecf8427e_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20180908/20180908152713_d41d8cd98f00b204e9800998ecf8427e_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20180908/20180908152713_d41d8cd98f00b204e9800998ecf8427e_1_mwpm_03200403.jpg"},{"uniquekey":"ab84943a1fcd5195e6939036d36d7782","title":"第四届\u201c一带一路\u201d女性论坛在上海举办","date":"2018-09-08 15:25","category":"头条","author_name":"北京时间","url":"http://mini.eastday.com/mobile/180908152507634.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20180908/20180908152507_98413c8b59dcac2d4de19a0802b8e434_7_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03imgmini.eastday.com/mobile/20180908/20180908152507_98413c8b59dcac2d4de19a0802b8e434_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03imgmini.eastday.com/mobile/20180908/20180908152507_98413c8b59dcac2d4de19a0802b8e434_2_mwpm_03200403.jpg"},{"uniquekey":"037d26d8e08630d38bbe751451d71be1","title":"36岁潘晓婷的实力依旧强，容颜依旧美丽，感情依旧还是一个人","date":"2018-09-08 15:24","category":"头条","author_name":"体育实时播","url":"http://mini.eastday.com/mobile/180908152453793.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20180908/20180908152453_ca217696dd50447571d0d91a2b99e96d_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03imgmini.eastday.com/mobile/20180908/20180908152453_ca217696dd50447571d0d91a2b99e96d_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03imgmini.eastday.com/mobile/20180908/20180908152453_ca217696dd50447571d0d91a2b99e96d_2_mwpm_03200403.jpg"},{"uniquekey":"e3886580b245a1ac693bbf03d3d946dc","title":"农村有种野草，在民间价值很高，煮水可治脚气，人称\u201c鬼香油\u201d","date":"2018-09-08 15:24","category":"头条","author_name":"哆啰兵驿站","url":"http://mini.eastday.com/mobile/180908152433914.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20180908/20180908_a4288ccb696854a99ea8d328715d02bf_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20180908/20180908_92b070d96601de07725456ff49cfcf50_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05imgmini.eastday.com/mobile/20180908/20180908_76089c62641aa0abf70a9391fe2f5f69_cover_mwpm_03200403.jpg"},{"uniquekey":"b0bae4751e8137ac381211aa1f36b574","title":"女子花四万做水滴鼻，朋友说像哮天犬，医院：挺适合她的","date":"2018-09-08 15:22","category":"头条","author_name":"蜜爱小分队","url":"http://mini.eastday.com/mobile/180908152230356.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20180908/20180908152230_d41d8cd98f00b204e9800998ecf8427e_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20180908/20180908152230_d41d8cd98f00b204e9800998ecf8427e_5_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20180908/20180908152230_d41d8cd98f00b204e9800998ecf8427e_6_mwpm_03200403.jpg"},{"uniquekey":"f0669f0fd394d2e8e4b269c318897624","title":"主攻段放跟实力老将姚迪 在国家队里还有出头的日子吗","date":"2018-09-08 15:22","category":"头条","author_name":"最爱切尔西","url":"http://mini.eastday.com/mobile/180908152227995.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20180908/20180908152227_fd0c40d06d9aecc52baadc5e803624c1_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01imgmini.eastday.com/mobile/20180908/20180908152227_fd0c40d06d9aecc52baadc5e803624c1_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01imgmini.eastday.com/mobile/20180908/20180908152227_fd0c40d06d9aecc52baadc5e803624c1_3_mwpm_03200403.jpg"},{"uniquekey":"d91d321878f6a1c4bfa49832bb869a13","title":"王者荣耀：天美最应该采纳的6款皮肤设计，最后一个实在太美了！","date":"2018-09-08 15:21","category":"头条","author_name":"王者时刻","url":"http://mini.eastday.com/mobile/180908152144711.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20180908/20180908152144_d41d8cd98f00b204e9800998ecf8427e_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20180908/20180908152144_d41d8cd98f00b204e9800998ecf8427e_5_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02imgmini.eastday.com/mobile/20180908/20180908152144_d41d8cd98f00b204e9800998ecf8427e_2_mwpm_03200403.jpg"},{"uniquekey":"8c60bfa44037ff585e2ed3984bb5f4f6","title":"美网德约3-0轻取锦织圭进入决赛 有望争夺男单冠军","date":"2018-09-08 15:20","category":"头条","author_name":"吃怪兽的小兔几","url":"http://mini.eastday.com/mobile/180908152054047.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20180908/20180908152054_45fbd8262fe430de3eaf6fdc61a42d64_7_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20180908/20180908152054_45fbd8262fe430de3eaf6fdc61a42d64_9_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20180908/20180908152054_45fbd8262fe430de3eaf6fdc61a42d64_3_mwpm_03200403.jpg"},{"uniquekey":"c293d0c547929de8b2194cdac1103394","title":"美国姑娘第一次来中国，凌晨出门后被震撼：中国实在太安全了！","date":"2018-09-08 15:19","category":"头条","author_name":"留住最美的瞬间","url":"http://mini.eastday.com/mobile/180908151938220.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20180908/20180908151938_c58edf8583c9ec472da82b01f4cdba51_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08imgmini.eastday.com/mobile/20180908/20180908151938_c58edf8583c9ec472da82b01f4cdba51_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08imgmini.eastday.com/mobile/20180908/20180908151938_c58edf8583c9ec472da82b01f4cdba51_3_mwpm_03200403.jpg"},{"uniquekey":"0fd80232b69de1223f9f8eb9cd200170","title":"【执法实录】\u201c两快\u201d整治进行时，徐汇交警\u201c零容忍\u201d","date":"2018-09-08 15:18","category":"头条","author_name":"警民直通车徐汇站","url":"http://mini.eastday.com/mobile/180908151832763.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20180908/20180908151832_d41d8cd98f00b204e9800998ecf8427e_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08imgmini.eastday.com/mobile/20180908/20180908151832_d41d8cd98f00b204e9800998ecf8427e_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08imgmini.eastday.com/mobile/20180908/20180908151832_d41d8cd98f00b204e9800998ecf8427e_6_mwpm_03200403.jpg"},{"uniquekey":"5e24bd07dc204e8ab3aab72c361117d5","title":"搞笑：二哈你们一家这车开出来很拉风啊，回头率十足啊","date":"2018-09-08 15:18","category":"头条","author_name":"小雨刊物","url":"http://mini.eastday.com/mobile/180908151811905.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20180908/20180908151811_94c0b633160cb6e511bea0d1ab6459dc_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20180908/20180908151811_94c0b633160cb6e511bea0d1ab6459dc_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20180908/20180908151811_94c0b633160cb6e511bea0d1ab6459dc_4_mwpm_03200403.jpg"},{"uniquekey":"72da1b957fbec442393a2174117be950","title":"杨紫 又一波时尚\u201c暴击\u201d, 杨紫 芭莎慈善夜穿搭也太好看了吧！","date":"2018-09-08 15:18","category":"头条","author_name":"塔种草日志","url":"http://mini.eastday.com/mobile/180908151802245.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20180908/20180908151802_d41d8cd98f00b204e9800998ecf8427e_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20180908/20180908151802_d41d8cd98f00b204e9800998ecf8427e_6_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20180908/20180908151802_d41d8cd98f00b204e9800998ecf8427e_1_mwpm_03200403.jpg"},{"uniquekey":"caee209c6301f01b7a834642522779c6","title":"和悦华玺-北京70年产权限竞房来袭-保利金地首开联合开发","date":"2018-09-08 15:17","category":"头条","author_name":"立意文化","url":"http://mini.eastday.com/mobile/180908151750196.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20180908/20180908151750_5891296c7ffca4621444bc8174107b56_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20180908/20180908151750_5891296c7ffca4621444bc8174107b56_2_mwpm_03200403.jpg"},{"uniquekey":"85825b2e51f3919d48af84d667a04d0c","title":"这几种\u201c水\u201d别丢了，浇花太好了，花草又长叶又开花，长势喜人","date":"2018-09-08 15:17","category":"头条","author_name":"小雅在阳台","url":"http://mini.eastday.com/mobile/180908151735569.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20180908/20180908151735_54ff90c6adc372d7bc101b57a8752516_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08imgmini.eastday.com/mobile/20180908/20180908151735_54ff90c6adc372d7bc101b57a8752516_8_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08imgmini.eastday.com/mobile/20180908/20180908151735_54ff90c6adc372d7bc101b57a8752516_5_mwpm_03200403.jpg"},{"uniquekey":"11470750997a74b0d958c5faea9a7697","title":"经常吃这1种鱼，对防癌、降血压十分有益，尤其适合高血压人群","date":"2018-09-08 15:17","category":"头条","author_name":"活力营养师","url":"http://mini.eastday.com/mobile/180908151712017.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20180908/20180908_c50c5472c5c283675a24f6dd6734490e_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08imgmini.eastday.com/mobile/20180908/20180908_13773424702e071ec481ad824c405c0a_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08imgmini.eastday.com/mobile/20180908/20180908_a42eaad4165860056051856c1daecd1b_mwpm_03200403.jpg"},{"uniquekey":"cc347da4c63646fc225b92b9f5f54ac4","title":"汇银解盘：9.8下周黄金不破1190多单翻身有望后市走势操作","date":"2018-09-08 15:16","category":"头条","author_name":"时尚搭潮流","url":"http://mini.eastday.com/mobile/180908151641334.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20180908/20180908_a2b48c30372675b29febc37d76cc07b6_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20180908/20180908_b4d768994754c0a9a22cbbbc60a09178_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20180908/20180908_e3ea2533d38e0e88d1a24d4aa2fde172_cover_mwpm_03200403.jpg"},{"uniquekey":"50a9b87ed45b6b5724a1f545377f9f2b","title":"美国警方：刘强东案仍在继续调查","date":"2018-09-08 15:15","category":"头条","author_name":"人民网","url":"http://mini.eastday.com/mobile/180908151501068.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20180908/20180908151501_c58826cda6e5613c523ff6d721144132_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01imgmini.eastday.com/mobile/20180908/20180908151501_c58826cda6e5613c523ff6d721144132_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01imgmini.eastday.com/mobile/20180908/20180908151501_c58826cda6e5613c523ff6d721144132_3_mwpm_03200403.jpg"},{"uniquekey":"c1500e13e3d30579725529b17727c216","title":"美军M1A2主战坦克装甲并不强大 曾在竞标中输给了德国豹2","date":"2018-09-08 15:14","category":"头条","author_name":"利刃军事","url":"http://mini.eastday.com/mobile/180908151436855.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20180908/20180908_62411c7924c5c9397a567fc6adece205_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20180908/20180908_929df7f5b6e0119439f559a91305435f_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20180908/20180908_79a2a84041ff9f0571c723f5b179c3d5_cover_mwpm_03200403.jpg"},{"uniquekey":"d2dba86b268fc4d6f5d3c100a74f4a10","title":"搞笑漫画：法海不懂爱？老司机开车了","date":"2018-09-08 15:13","category":"头条","author_name":"爆小漫","url":"http://mini.eastday.com/mobile/180908151321211.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20180908/20180908151321_44df1773e2c110264b7a70d69384ed50_6_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20180908/20180908151321_44df1773e2c110264b7a70d69384ed50_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20180908/20180908151321_44df1773e2c110264b7a70d69384ed50_5_mwpm_03200403.jpg"}]
         */

        private String stat;
        private List<DataBean> data;

        public String getStat() {
            return stat;
        }

        public void setStat(String stat) {
            this.stat = stat;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * uniquekey : 9d043389e5f1629592a0e10ac2d8f096
             * title : 这些国家刚和台湾“断交”，美国召回大使
             * date : 2018-09-08 15:54
             * category : 头条
             * author_name : 人民网app
             * url : http://mini.eastday.com/mobile/180908155443916.html
             * thumbnail_pic_s : http://07imgmini.eastday.com/mobile/20180908/20180908155443_52d7f39c7a86346d27b525bae3eb1253_1_mwpm_03200403.jpg
             * thumbnail_pic_s02 : http://06imgmini.eastday.com/mobile/20180908/20180908_c33fa4762f51628a63b9c1fc8e2c1cb0_cover_mwpm_03200403.jpg
             * thumbnail_pic_s03 : http://06imgmini.eastday.com/mobile/20180908/20180908_a578b204317b2b549dd7b8628c6c68f7_cover_mwpm_03200403.jpg
             */

            private String uniquekey;
            private String title;
            private String date;
            private String category;
            private String author_name;
            private String url;
            private String thumbnail_pic_s;
            private String thumbnail_pic_s02;
            private String thumbnail_pic_s03;

            public String getUniquekey() {
                return uniquekey;
            }

            public void setUniquekey(String uniquekey) {
                this.uniquekey = uniquekey;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getAuthor_name() {
                return author_name;
            }

            public void setAuthor_name(String author_name) {
                this.author_name = author_name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getThumbnail_pic_s() {
                return thumbnail_pic_s;
            }

            public void setThumbnail_pic_s(String thumbnail_pic_s) {
                this.thumbnail_pic_s = thumbnail_pic_s;
            }

            public String getThumbnail_pic_s02() {
                return thumbnail_pic_s02;
            }

            public void setThumbnail_pic_s02(String thumbnail_pic_s02) {
                this.thumbnail_pic_s02 = thumbnail_pic_s02;
            }

            public String getThumbnail_pic_s03() {
                return thumbnail_pic_s03;
            }

            public void setThumbnail_pic_s03(String thumbnail_pic_s03) {
                this.thumbnail_pic_s03 = thumbnail_pic_s03;
            }
        }
    }
}
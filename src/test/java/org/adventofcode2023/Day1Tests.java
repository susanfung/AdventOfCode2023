package org.adventofcode2023;


import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.adventofcode2023.Day1.calibrationValuePart1;
import static org.adventofcode2023.Day1.calibrationValuePart2;
import static org.adventofcode2023.Day1.findFirstDigit;
import static org.adventofcode2023.Day1.findFirstNumberWord;
import static org.adventofcode2023.Day1.findLastDigit;

class Day1Tests
{
    @Test
    void answerDay1Part1()
    {
        Approvals.verify(calibrationValuePart1(
                Arrays.asList("2911threeninesdvxvheightwobm", "3three16xsxhpnqmzmnine8one", "seven5khtwo891hlb", "sixthreeqpzjpn195", "jrnf3",
                              "qpzcfbfsrxthreenine3ksbghzzffsevenfive9", "2fxvxzzgdnfkzzh4eightnine7five", "4fourtwobjscjgtbvninesix",
                              "onetwofivelvnbcbn5", "6vjdtd1j1eightone", "sshnxbjrt1", "5ljsxqjdxr91", "71six14rkdhdszbfz", "khlm3",
                              "jnsjhqqtj6fourslpqntdzxpfive", "6eightp", "qtqrcs6gdqmtznninexvpnrn", "sevenrcdbnzfltt4seven3nzsixthreeszr",
                              "onefour96qtffc", "klpksqsggbrffive1tdsfptnvs72", "lsx3qrmznjrfnvvzveight5one", "dqlrxck2fourkp6two464",
                              "5niner3kcdsxqfoureightfive", "lqtwo7sevensvghmsdjzbbdrhqjg4", "xxtwo25", "six6zxs8four8two",
                              "four7five3mcmhxxtm6", "oneqdkmbvvnmf64three57", "9fourjgmhcnpjfhtm", "3lzjfvthreesevenzlbgpcslvrpglqseven",
                              "6eight1", "xxcgtrqzcjjtwosix7ninejzzsg3", "1cqxsix", "5tjmqldjsixsevenfour4fxxgsbjbxrffvzbxd",
                              "nine2mpcplqktt", "rldf79eightonedfjvkvjjx", "3fiveeightoneightg", "95six4three", "kfn487oneone1mckljv3",
                              "2four6lcbvninezscnjjztwo3two", "469sevensixthree", "vqvjll1seven78four", "1fmstxpg9", "onefxtvjhxmfbgmf1three",
                              "threefivesix8onebxpdfkxddkdxnt", "ninevkcxflcfhqx664", "328threexc4onetwo7", "nine51", "threefoureightv2",
                              "six58jsq69", "63gzvtseven3eightmnbrmtktseventhree", "3onepszzgskhjl6oneeight", "llrrxkmrvz2three53",
                              "sevensevenvtqdnvf7qhjt1", "53eightkfrrtvsq", "ninefxltvtgmrlhhdkbtbsevendrpgrcrq3two",
                              "m5hxxkgoneqfgmhndbdslvrjrnk5five", "fourf9one3bzljjkdl", "7drfddqr4gzthreefour", "seven61ninethreeln",
                              "3spmthreeltlkfmcdvlfxvbnlmgsnsqskh3five", "k93nine", "jpbdrbvtpgzlfnqzfourfive79tmnhdm6two",
                              "dfqg4ghxvnrzstd4four52hzqkdpkdnb", "85dsixsevenmpcclxdjvsvppkpflhxqvgsjnbsvlcgv",
                              "threecvfdcnxfoursix8xjzcdtbnine", "rgcxrc9nineeightwoxcb", "three72", "tpfrhlnkdptwo9vgqvdgfqdg9ninemrzeight",
                              "8twonqffivelnlmpgmtwonine", "snqgdxsczh5nineeightthreezqxmptlss9seven", "zvsmmlgt8mzlhvbfftqnn6sevenfive",
                              "vfvdxfx1fourseven3194", "8j71psdplqssbhvxhbxzfivefive", "dhbtmxvfjjkdkdvr6",
                              "mnkhzskxoneoneeightseventhreeseven3", "sevenzzrt3vfcsxmqgh4", "nbkxmzzcxtpqzvtninevfceight3tjqzsbq", "j2",
                              "four53lz", "jkrxvxl7pfq", "bkfvvnrqsqfrmbzfournine9", "eightonekgcgdpvqksthf9", "jqseightfbdqxzllfrnnth4",
                              "2gfhfpvqzs6vhcvjlrcsevenone", "78tworxggpzr", "kst8eightsvvfzblthreethree", "63three9clsnvmkd",
                              "2nfrb95hsrcqcnrvlqtnt", "71sevendmtwotdvz", "kzkjqsseven6gqdkt", "sevenseventjsvjsix6fnggzkvnine", "262",
                              "5371twonine2fivetwonepb", "7g", "eighteight9", "5xfjm", "txhninezhplccmvkj2",
                              "dzxgmrjzthreedxtqthreecrkqgqhthree8", "9vngn", "5mngdkppsix9mtxzxjlmfz9one", "6seven5threeseven8seven",
                              "9dxpznmpjv3eightsix", "6foursevenx", "twoseven1", "five1eightfqgbmtzone", "fgl424seven", "7177fvc8rkdptrfour",
                              "6sixbbhp89", "four8twovpkrtnshhone5zfnpvfdl", "4threebmrpbhrnfpn", "three2vrxztxn4xt1one", "threetwo71",
                              "fivetwo6sixzfzxbgqeighttqfour", "hbbgfhrqvxpqfourthree41", "oneeight3xqlvnb56dtwo", "666two8",
                              "24kgvqpqtngmlrtfmqfqprvrxzqsxjffour5rvffnntblhnr", "dhmhrdntwo6",
                              "grkqnbfeightsevenjpvqmhmbxljrlthsixthree5czqlcvm", "eightnjbjnpl6three", "dxstwonesevenbqtqpjs5five",
                              "eightgrbmmnine7", "1one9", "bqhbdkf3nine", "sixjbckxghxr5xh", "fivespsvx35five", "5foursixninedl6",
                              "xcbgsjhsix3threelbntcllhdjvqgone", "seventwo1", "rdfqxlh8sixcqknsix1onethree", "9b7sdpqsg5gn",
                              "threetwofourfive6fivesfive", "k7", "mzhthreerlrmfhzzlgzclmngn5sevenlxqnbq7", "1seven9621",
                              "fourvgrmxqkfqtbfivelvm312nsdjjhqcqs", "fvnine8", "fourpcvmdzbzsix7bqdffvsgvd", "51threeonemlccggqsxqthree",
                              "14nine5rrzfseven3nine", "gcq3nkkgdjlcdmjvrpthree7", "sevenh4grcmgl", "shjjpzcrljpmfsevennine4",
                              "five1sevendpjthd1", "dncxsx3drbllpfxp75chrvhvbblsnrxshssjxvztljmqgb", "bkrhmrbqtzznhzdt5ccnlxvnlvsdnsk",
                              "3drxdrxsclrpt", "7eightsix", "fourhdbsgsj79six", "5fiveeightninesixeightm44", "four2five4rjnth3sone",
                              "threesixseven3", "onenine45three", "nine2qcrgnphbmnkronesix", "dsmbgbhgrvone768bvlznvfivesixnine",
                              "four2three9", "66onesix", "fhtqmgrz22lhqrhngrjd7", "8fiveonetwovd5onembnqk", "spzzrkdf2",
                              "92cgtsxninesixeightthree", "41n1two8bfrnqclvrxghmbtdtskv", "mgmqskkcgf4zrttjstmfsnineggdnbbvnfour7eight",
                              "sevenjpdbdqh9cxvvzgbhtzntn59", "ljh34fouronemonerk", "68one6271", "5sffblcpghqvqxfive7ninev",
                              "nineeight6bzvsdcks", "5ndsk4", "vsix5twosevendv2", "4dvvtzjvcxr3eight5two",
                              "bmzrnveightthreesevensixsixbfplfcx3five", "5tmkgbdrj", "91tnkfconeb", "cvfrdpkqtmbcrrzfz4v59cvglzjxseven",
                              "7five6pz", "4svjpkzv6", "6476sixq4", "3f", "1qlbcrdgg", "9dzrjgr", "spcsbjmfdlqnqdxthreefourdhpzzqkcxlfour2",
                              "eight7eight145cmllsqfhj", "7lb73mfhnhflp", "2sevenfive", "kxgtbtcfour7twotdsj",
                              "eight72bcbtwohtjjdcpprfldglsix", "eightgjrxptfdsvcpjnine7sevensixfrbnkdxl", "onefive3bfdtfnjkhdsrzthreefour",
                              "xnsevenxxgckdztxf628nine", "2qfq", "nbxd75hrdqnmfive2onenlchjfoneightlh", "6seventwofiveqfscgschrpjp2",
                              "skeightwofive4", "5bfjpsmdl", "tjdnlshngvsnrbvmch69tqnslrhmkthree", "5sixfiveseven1ninenineonec",
                              "26xclfjhbxplseven", "oneoneh24229", "two57twolpcnine8three", "nznzdxxvrqninesevenrphxk48tmsj7",
                              "threelctkpmbkp38", "eightsixthreepvxxntfqdcsx2", "nrzg4three1sdggv9two", "3c2cgglrzk",
                              "ktbzmhmtx5sixglkfnfseven7", "4plzqdltwoptkndtbxpt7", "fourrzcxbkpxthree8four", "nine9ccsgftlfxpgvgt", "1five3",
                              "two9fhprhfkkljvgfgfgftskpndhqxtrnfxsndfourzbrrl9", "59svdgrxzsxgqdvhhztwo", "sevensix833", "45",
                              "5gnjcfour3hthree", "5three47", "nine4six8", "two84sevenmdjcvqfmjtqnine5two", "7dlrvr7jgftqp", "onehgxf9",
                              "five713onesixsone", "6threelpchone6nineone", "qhclhsnlghnineseven3",
                              "psgqpnbdhtj6eight2vgmbbrrzhtfxqvjxzrrdfrmvs", "qm67krpfgpqjtgfivesmjtbhfddrbvbxtnnhj4", "fivetwo4six",
                              "spfxkx5six5", "one3pcmponehgcqqkrbplzbfivesevenhdzfcsl", "dsgklztwo35eight5gzqtrckskgspkbcz",
                              "eight8twoonetwotwo72five", "9fiveqhhbml", "p1five6qsgjvmmqdkjspn", "9three16", "tntlhjmb8ngngvrsqtfdhghbkxt",
                              "5483", "four79fivexgkjfs2", "2ninetwo6tpknmfrpp9", "22ncgnnmlfxgsixprr6fzrbzznsvzcn", "chzbgzh7",
                              "threesixhfptmhfrjlgkxj4nineone", "7914", "1six2seventwo", "34one16five", "tgrlhbnq78twodbrspdkkpbrttwo3",
                              "fiveltsrqkqcfx9nine475sixvzbng", "npdbnfiveninetmlk4lqnskpllrqbzlvb6", "vfeightwohkppsbxf2", "6qvmprfhnfs",
                              "chcdrrkstnsmsrvjbqk1eighttwod1", "xjgsvj9dvnthx", "shsix6sevenhhqdvgsixszz9", "xjqzfhsixfhvdpxpgp7twofour",
                              "vcsdm48tkmkt6snpdtsfbtpbchds", "3nffrsqkv7", "2jbrtfddhskblnxqxzrdbkzfkpkxdtcgxsd14",
                              "two7773foursevenfiveggcgc", "eightone2eightkzpmrbjcr7spnhdkx", "7four1seven", "mbcrsht8hnbkmkxthreethreefive",
                              "zlckddkg4threeonekslt", "dtdbkcjlmmlppghbg1fourfgkrsix6nvkrxbnine", "412rxhqkjrqpceight4qdzv", "eighttwo5",
                              "ljtlkbsstwoonebbnzkxrlhsixsix57", "eightbrmhfc6zeight328jmtpnt", "4fourvxmrmrb2two",
                              "threeone1txqngsx21zrseven", "1kpsggqxvzmrcsevenfivethree", "9lzlzlcdmcnrtwofourseven", "four4lbvcxmxf29",
                              "6ninezkhhjj", "bngdjjdxnndzhnpfivetwo17", "blhsbxzvtncpzfour82one9oneightfzj",
                              "cqqlvkdsf531rnvzzldbtzssxb7njhfdvc7", "six5sixsixblmnhrkx76", "four5zhscnznq3fvdgbmpvtx5",
                              "9zoneghtsgnkn8blxcmf1four6", "threegtjftthreefive1nine4", "855ndhrqsvsnktwofphv", "fkfbsrvksixsixssix2",
                              "five19sjvfzgrb7nhzmzfsbxbrdknvsq6", "twoqfhc4five", "sndnrlkfjqgpnn9sevenm", "bphx1cvcvdghrbbhjdzptwo",
                              "gxthree46lbltzmv6", "fourtwo3seven", "48qfgnmnzsevenone4fourninefour", "xfztwo4pbxxnzsttwo",
                              "jgmzslhmfkpxkfssxh2rptkvfplhldprdqmhxgdqqdpb", "jfzpsxzq1", "3vjtbdtwozdgjthqrhbcpbcjvtqbpcstqmqrmd6",
                              "eightv2three4eightwobgq", "12jmqnmndzvnvjzcrmphnjvhnv", "onelnfnxj6six", "three723thxk63", "5nzsix5d",
                              "seven2zpsfzbfjcmbsevenone7nhv", "sevenjlx3twoeight", "kttwone223", "1hnlbcvnkj9four", "6eight3snlrnvfctwo",
                              "lfndkjtnpd1twonine", "xqlc6", "fdtgb9gptnkvh57sevenmtffxlc5", "three3seven48", "654",
                              "466fzklqfourtwothreeninejhjgnqbnb", "gx3onefourfourthree6", "7one68oneff", "152nineninerpmkpv26", "ddf5",
                              "krqlzrcqfour2", "six9fiveonechvqncsdgmvjkpgdvjdt8", "sixhmhvkrzpsfour64", "threeeight82szcqeight",
                              "kr4five5qvndccconerjcbnvshmlfseven", "3sixczmeightwomth", "twoccnbqmnxlj6oneb", "eightsix317",
                              "dnhccxeightfive7two", "2hpqccrxffonecrphsxttnxgnmnineqqone1", "796nineggdhfivetwocfdxq",
                              "37bqzxkpht6gshfstzdztchjrqmsdlz", "9kphmthree9", "345oneeight", "x98eightone38fx", "769two", "hplrjxbvcbt2",
                              "74ninetfqdtbdspjninefouronepqdhfive", "9two1qxmrgfg66mlvkl", "srjllhninecttnqj5", "6cxmnhlrkxdtwo7hd3kqpd8",
                              "nine651xctjzpbdpb23ltn", "eightktvrj8fivel", "7hcxninesrcbdrmjzbvdrxmnfour",
                              "sixltkxmhcvxv9pxstctcvgrfsrhdxqsix", "kscjlfmseventhree2htsixlpbvb", "5bcbhkh8fivetffq",
                              "bsslrpbkgk4eight1vcb", "63fiverzg253four", "6seven5eight", "ninesixtwo8", "twod52seven", "52fs5",
                              "fournine5qsc5vrvbzzkxqlthree", "6sixfive", "tnbqgfmjgglnhqd4gndbb9four", "seven37gmkmdqmkggrvkdzldgsix2hk",
                              "1one75five4", "onellgpqghhmsnddnhgthk2four", "one5bqninelpckjbtg", "lqbssxxghpczz1sevenrrghrncbjfourhdcsns5",
                              "t3foursevennine5nine9", "9fivefourndphjnsvxzqgfqg6", "fivekqpfhbtthreeqvcmblsxhpthreesixnine4nine",
                              "19eightghgzbkv3xlrqncmcg", "five6fivepmjlhgdmpjvnjjpzzqctgrr", "eightstdlttjzkfive3one",
                              "nineldnhvqqdrt2sevenqxgltrhgvtdnfcxcsknsgkzjzbvc", "6tjkxlskvg414sevenjsevenfive", "5ncdmtdhbs",
                              "nine7onekclmqxkfdtqone3", "8zqcsnkfnsnlhfvfpxm", "six6qltwo56", "pdpcvgslddtwofour6jqjfjzvd", "vcsvxcfdgqpp3",
                              "six9three5nineninefive37", "ztffive8", "mggphlsjczvsevenlb1sixssbdsltthreetwo", "ninedpjljc177onetwo",
                              "two7fourvstgmr3rtlztqddmnghm", "2dgtpz521", "1ninesmsqtgzone", "ppsgnsnineninegjvpvcnp5", "ninethree7",
                              "312cspj", "7threephmdnmnzlfpgchqfj37fqz", "5sevenhqxkqfd4cqmqhsfbhtt", "ntzgqnj5", "167", "xbpdhvfourfive7",
                              "73kffl1one2", "fjshmr65sixrkqbtpxqnpqgjthplnlv7dfrktxvng", "eightzjzvhp12twoeight", "mgczvgctfb8tmsbtc8qtwo5",
                              "jjpbkl67fivetmbc", "llprxv4", "two5tvc", "nine3five", "7nine2foureight338", "6vsflc",
                              "jfgxsixzmtzjxxfc2pg7one", "dhkjgnlxd6tseven3", "zxcsrtdsjnine84sixjzcbsfneight", "hncmq88",
                              "twofoursix1ninesvlzhpgc", "pdktnvrqqgmpllxnmp5four9", "4xckfzp", "xpckhm45", "nffone49", "8qqthrdd71two",
                              "xksghrh7oneone245cvcnrfgtwoneq", "fivesmcb7", "mdqdktxplsqbnhztwothreetwo5czjzjsztclb4",
                              "7two39xsmsvhqfkxgxveight", "33twotwonine", "6j", "4dfxcvdpq13mlcdsnine", "four7kcdglrh5eightzxvrrrseven",
                              "phzqhdffour55sbd5", "5vcjmvzd1four4", "rgp1x", "four9three2twoeightvzvlpgrnine", "78pkrqbdtqzhmszzf",
                              "sndtjtn93fivesevenvqfffjpmz54", "fvzoneightfour85threehmqdhbskvg4", "threefive2seven8eight9sevenfouroneightl",
                              "7three68ndqdk84pm", "gponeone7zdrzgtvbv8seven", "threeseven4ndvnnkpqssfsm2rcnjbgkbtg9xp", "7threesixseven",
                              "8two3threefivethree", "twongkzk85rteightfive", "47ninemgtknhpqqqtk9foureight", "mk2fourfive7mcqtf",
                              "cqqxsqkx52onetwotoneeight", "3dvbblknjfnine5seven", "85dntjeightwom", "9btgrgqdkb7twonine4two5sxpqr",
                              "1xlnnfxdsix", "1jvbhsftwocdl1hklfqlpvr6", "twop2ttjfrtrdcs", "385jtxlfdngz7rgjfour", "4ft3three65",
                              "74dnxqvzqp85146", "nhvltrljrpfivesixthree1", "fourcbzbfr5threeeightwom", "nbnxzkgczj5",
                              "gvcgrxfr2rnbbnsqmksrjckcg8", "four1cgrrnvt59", "sevenglsixxgnjcfstsevenoneeighteight9",
                              "cmjbp5sixsdqbspxtbvfgxjpvb7bfsscksv", "9twodzbfqscbtthzfdf3", "ppcs59", "9sevenseven9vczdbphxxzmvskgqhzr",
                              "321sixhczhdblvbsrtkfm8kmtjmqq", "five71", "gkfoneight5two", "tr9sixgntvrkjctnvhpbp9clnseven8",
                              "3eightzzktskninefoursixonevfpnpqmdlhbp", "8five7k", "7threehxcgmh94fivejltrg",
                              "5qjtxcvbtsevendpgfrcldmkkvztbhldfgtzb", "49four4", "gxhmbgjz9qfmmnb", "2ppcfjeight2",
                              "bdjrltwoeight74kcrmjdbqkkonenine", "five6szxgtqlninefive1lbpcvg26", "3bpctmgczvvzzs7gqgg4four8",
                              "ssd584htkgjrdfive", "9vxbsrhmcsz96", "threethree2foursix", "onefourqqxvjhbzcksixnine97eight",
                              "fivefour3tlcfccflgkxvpksqqkc5", "sixfiveeighttwosix99dbgnf", "ninekzfzddjxn49seven", "four74znfnkzlnpz7",
                              "7sevennine41fivevbqqqlpxcg", "fivetgr5four", "2cmcn36threeflcmzkj", "tvp23", "jz1trjfiveeightvxslxtwonine4",
                              "dfcvmtpstrsdzs3", "qpzlmnjmzzvcvqthreeeightthree5four", "twovsdqrp4fdtgtbdhtwo", "threemkclqbksnj9",
                              "eight5665five8sevenoneightl", "6onenzczone9p", "8three2twondcg9four", "twoxsix6rxshtslbfh", "4vpstdq2",
                              "nine53", "6threesevennine", "jdfkb28tqnjnbpfksevenp", "29fournxtfnhqss68sevenzrmqdzqlk", "4znzlvvfs6",
                              "gvtwone7kqsqrvknnzsfgxzfzhx", "21xpfhfjzrvtgtrkkmh9five2eight2", "9rdzsix", "gnpcgrsevenoneseven9five",
                              "5one5seventwo7qxpgzbdtgkvtpnvclzgqqbf", "fkbfznkfcc9four3five", "xjbngj25", "8vlfour8nzftbhgxvlgskv",
                              "eighteightvzpxmtgnlthree2ninergj", "43eight", "37twoeighteight2seventwo", "11threerfrcqrhddqczvdcfive",
                              "ninefive7", "93fphqmdgrvjqjbpx1ctktzb", "3ninemfvthllgmbsix", "two3bbftseven76twonrdl", "435",
                              "93threemtfpf485sixfzvgg", "three5seven3eighttwothzvxhr3nine", "qztwone167ninermd1xhpft9",
                              "6eight1mstqgdvxznsevengdtrvtp2four", "nbfldvhzcttkninerhdrxpjffh8five6", "6sixjzlj3jpjbj16one",
                              "onesevenfive6seven", "6ninellfhpqgrldninesixthree", "three53jcrc4", "8five9eightdgvhlktbvv",
                              "2vllfmpnrjjjnxmmsix4kseven", "mmbdhbfqq9nine2threebshzhdknj9", "hznv78sqvxnzjppqfivesevenzskllffh",
                              "six5vndfv9kzc36", "9fiveonefive38two3", "fgqzjqt4qkpgstlbk", "72ninefiveseven", "zzvhpbbllqpdpbsff8seven",
                              "4jvpzjcrm8", "33one9dcppdmpcjdvssffsssb", "sevensp5fjdlmpzgtwolddrsixnlgjthree",
                              "4twozzkckvxcfzrzctsrtwoljznhpm", "fourseven8lnnvbfb8lsptnseven", "1znsgrrnjv2eightphktgn52four",
                              "gnttqnlvmfhrlcnineeighttwofivesixpfgfjgvckh9", "3vgkzseightthreemntsnthhpszrpkh1",
                              "fiveddksthreeeightdbxvbfseven9six", "trtpjjrqfc6cbsccnghpthree4rxclfrkeight8", "one4sevendxdrone",
                              "four5mttxghdqone9nvdbdnthreetwo", "sdtjdffive3sixthreeznrv", "2c3seventhreethreetwo7", "hldmdhr4",
                              "6hcrdxpnpjblngks9", "vscjsh3sixthreefour", "threexsdhnkmdvdjthree51pone", "3onenvx53nrhnrbqtwonine",
                              "twon67eightppqntrtct", "1onemnpcdl", "lrrzbxfrt56525three3", "fivethreevsnqxzxjdkp4nhnzsfknx6onefive",
                              "threectkjzcm8sixvbzmqq28seven", "mjfc4gddfhszzk6two", "3twoeightfbpcsrhlm9vkxeight", "pplone5threevdvfsthree",
                              "3sixzblcdxgrr", "3mrqceight8thtltkg6", "7six3cjznvgv1three", "tnpr1sixeightthree9eight",
                              "ninenjbgmznt7pkfdnrffrlhkseven", "ninejnsix63779", "cljvmznmjkdjseightjrtlrmseven4nine9",
                              "sevenfiveeightncjmffmrxcjkp5eight", "9ninefive7six", "8sevendcrffrhhjbzzmh7", "mrc168eightmvsnrqpkqd61six",
                              "1eightcvcqqtdjg29", "znvlfrt874nine5", "7hsdnpjx4", "21kvhtmvplcb2onethree", "7nkpdjsxvkdqzjsvxmvfiveq8",
                              "sixeighthgtxgslkhxvnlvll2nineninebnkffbbffsntrcvfdzmq", "five5nine", "hcsoneightznbfz6bbslrjphkg8",
                              "four1lfm38", "twoninelninexptcbs3threetwoeight", "9392three4eightk9", "2xnhmqxcxxs5", "zvkfmqg2fb3rm",
                              "3cpcvjfcngktwo", "gvnvbtvhvsmb77twoeight43", "three19nlcq", "jshvrzzseven8c2snfmnineqnbdlbr",
                              "bvvttclxpqttwofrkpthree6seven", "ninevjnine7", "fiveqhczdqzl4seven", "84tvhrrtt5",
                              "fourthreecmrvfonevsrsklqrrzpdp5", "knnmdlrk5threedzhdxjtseven3djbnqtfjg", "qbjkkslhb2", "two25foursix1four5",
                              "8pbkqrmtzvzbptvj7nkdsvcpg", "k1sevenzdzbnsjscpnine2zcfhjqdtvmjnpnsix", "7rjsfmz39ctpkgnm",
                              "4fivekjcmlxqeightfive8ninelszhv", "jsbjcvfcvlxs16twollkphts3", "8klnmlsonesix7", "lzmqtzp5six", "one7three",
                              "3szthreesjeight14three", "cnq3seven97eightcvvbkdzbfive2", "jfive72four7", "nineqgpbdzjqfd5nvcgcm69",
                              "jfjtrrhcgzgqgtdmdscthree8threeeightthreekvztcfnnxp", "xxfjjhvrdptwooneninebjlsgssmpsvvtwo1two",
                              "fourz9ccjjxzmqmhm61", "sevenfzffourfivehrpjtrvglprdg4cxtcjgc", "2cp5zbl", "czhndkczznnftdh7nine",
                              "lczpbbjnh1fourxbskj", "5sevenc3one", "1eightnqbmkhjzzxqsxn576seven", "kcxhmcnnonetwondzthz65three",
                              "foureightfiveczzdxgdvfc6sevensrnbvhftl", "six3fourfourfourfive", "jtmrqjoneseventhreedmfpv1oneeight2",
                              "6bslvklqfour9twofour", "threefive3", "hqjhndlzlmdtkkhlblvxs26vsnpkfjgn51three", "l286threerhscjbqts",
                              "859gmvdrqbbr2", "748onesevenone", "9fivetwovlmdgggvss", "2mmrxstxqbtwotwoeight7", "1eightsrhkzone",
                              "svjzgxrvcfjxp5foureightfivejlbtlmnine", "26nine7pph6h", "lprdrpvs23four8twoseven", "fivendxhlxvrmtlkmjf5nine3",
                              "jpcnzt6fiveonetzdbmxzzrnxblb7tmvmbnine", "seventhree62", "8one5gxljlhzgb9fourfjcmbsix",
                              "five7889onerkdxrlgrbqpb", "tlkkzfqpeight1onelvbbztlchhtrfjbdm", "jeightwo76one", "kdtxdv92321seven9jhczcl",
                              "12cmjczrskprx9", "mmffive33eightgzczrhxpngnsixzztlrx", "pcxlcnmqr5sevenjqt5mgbgjjcpeightzdrzgnfrbjbcgc",
                              "633bdkqk", "mfxfslmms8sixfour565", "24fivesevenmkprgbxlvzsnmn", "cqf8one", "7three8six",
                              "9sevenpgcfrnvzzmll75one46", "1eightcbprgf", "sevenfive1sjzlnlvcksnqzlhc", "two3fivefiveonesevenoneckfcrld5",
                              "threekxzfcxzjpfz92mltnrnntwobzhzgcg", "5fivexjsqskhdx29three267", "nine238ktdrmpkhfourbl", "9f", "vxstggkg747",
                              "sevenjkpsmkzjrtrhcd99", "gfour96gxpchmkz", "5six42lvxfbc", "threetwothreecck34three", "2five7",
                              "fivecgxqrcbdthree9hxbkkzsfpm7", "eightgjftmmsix3", "eighttjfpxbplxm35rrbppjfjsts", "9one3db",
                              "4nz74six68dpfkthree", "four4five", "3fourcngqmpkdtmnvfbsevenfourl", "slvb13", "6sevenone", "eightg4qvrdkjhsbn",
                              "three1eightthreesixfiveninesqczjcm", "jtnddjsbcseventhreenine2ninedvblpcl",
                              "ppffnzsbmnzctdjqttrxzeightz1three", "7r", "vhksnh929sixtwobfdtmrfxbnninegtxkrnl", "zfoneight1", "9six123vcjjz",
                              "99vknnqszvvm7", "threefour1fsxgqvcs2", "fourmssjszkkz1four6two8fhfgbkkkxfive", "4three37bx8lgkvgvjjpxzcmfvn",
                              "twotlxxhm6four499n", "7xckrffbmzf75sevenfive3four", "2ninetljfcpnrzkh743oneightlgc", "5eightxninethreeeight4",
                              "56threefournine", "thfc37fksgkkknfour2nine", "4jtbckvmqc", "1534", "threexcc8fourmtvkqdchjx",
                              "3sthrzbjbxpcsdhjmfjztbgknrpb", "1fivextcmx9six", "one639lkjfive", "twovlxkxbqrjs6one1mctzqzx", "nfour1ckrgnz",
                              "four1jsmdn", "615", "two6fourgqqz", "fqcmkbhjfntwofivenineqhqssonessvmc72", "6seveneight5rsftxhhnknjj",
                              "threesevenfiveeightntjgpkxbmkqxhstdq6gjbzxqjsmm4", "qxnslq294gddrlkvdxqdqkcghfbgseven1",
                              "ntdvbndqqvmhtrzvvcdlqz1", "lxkbqjcseven8eightsevenddzqsevenjst", "11vlvklqqgsxhxngseven7kljlpjfive3", "17zxn",
                              "threeeighteight9", "onemzdc7six", "13dttxqnfdv3jhctwo", "7jxhhlxfsxzkqztwo1sevenc",
                              "thmbtqqmtfzfnftqbsxm6eightmhffive7", "nineonebd5dfzqfpsxfour2", "4onevszfmdxmcrzmpckssixthreethreedt",
                              "5keight7", "two9hjbcgdmone", "nine4qsf", "stwoneninefivexszrjm82seven", "92krcsixsevenznqcbdvpntbjzcbm4two",
                              "fourfourhqeight9rbrtljfgqsixfiveflslbbxxheightwobhv", "three817seven4tstspnczkeight", "7nfd9",
                              "threezngvkmj7mvksmsvjxjfiveeight", "9xninepctctsevensevenqqqddldd3", "kdbxsix798fvsrhvxmtwolmxpxcm8",
                              "onefournine7", "nchnine6gtszxkhtsvzjcnmlqninevkkrvv", "8shtwopeightgbzmbbdnrtpmrl",
                              "85sixhbfour4rldcdnqneight", "xbjhhjbk4148bmsvjz819", "7qqvmxlqzqlmrr", "one914fourfive",
                              "eight72threenfmbfnxdhkmgjkrmsc", "eight57sixvmfjprpm", "8fpfkxffqzp8", "95hbbl29",
                              "pzvhmkdgqp1dhsrlv78bmvhdqfcgcpdtgtpmmlnmkfive", "16onesixb68dzz", "sevenninenvmbjknplxseven57sfghptmq75",
                              "xxztwonesixone4gczrnpzrsfqqlzseven17", "xnfive9fourlfive162", "fivercg3qkgdxpdxcpone", "sixdqkhhht46ghvd814",
                              "zvpdmfvgxl45nine", "7four4bmjssxznnmgtlqhptcbfive", "four49nlkpfxjcnine81",
                              "zdgtfqszsctjtvr7qqhvsninesevenxtcmdhfzxvfrtjqhzmm6", "5four2gmgmvzkvgknfpxfive", "2two1",
                              "47eight96keightthree", "7cb", "eightdzzjjknbxv5", "dsmgfoursevengp4",
                              "5fivethreeeightsixxqnrsfxxmjckfzhddhszqvdjr", "3jpsrxlvninefour7gtjvk", "bfdtkgfhlnkhdrpfg3",
                              "qhzdzsix6one9one", "four75qsbtrb9mhhhhnbl", "seighthgddd275nineeighth", "ninemgsixrkmhdpjtzgfive91",
                              "8ninetwopeightsz9", "three427c5eight", "3sixoneninefour6qksfflsvhk21", "8onex76vmhxm", "sevenkrvrdfived4six6",
                              "rzqrxmq21", "75gszfc8vrj8", "hdgclvmgg33two", "1dv8rvdxbfjclr", "grrhjthree9fiverhqt",
                              "6nvtzl6shxrlbmrqckseven4four", "foureight4sevenkssixhdvvbszkceightsix", "foursctcndrchdbfourtwozpdkjc3vqv",
                              "874onethreesixtblzsnrrdvqmpgpfb", "1pgmgczsgngx", "475", "2jkfphlzqhz", "4576",
                              "onegnbrseightptrgdfkbqdcvtwo1qbxj", "4threeznd", "8two21", "7nine8", "3seven2dbrzxbfvg4",
                              "4937eightctmzkxkkzr", "5mtccqv2threeonetpggmmzbhlvkt", "qpjvmgqxcj2sixeight",
                              "ttmztwozrfqhfhgkp6pltknxmcfqngh", "onegnztn9six", "6ngsnzbfvvtone27foursix2bqhbkgkr", "onejnplq3",
                              "hmltwofivefourvjkkdjjksbdksqtnr2trxnkltgp", "one9four5mvgjgjneight", "358hxfour2", "bsmgfvnt7jlsrdvbq",
                              "sixoneone5three8nvp7zthbv", "jmfpnrmrninesevengsqggg7", "mkvgjdjhvsevenone8eightoneightdhq",
                              "threeccljpjhthreetwo6923znj", "1pjkbks6one35ffj", "ctpdddkxtstvzcgbfdfspbloneonethreekvsltblvhx4",
                              "nine6zmzkjlpcsixsqt7gkbdhjqnthree", "twofive1sevenkrnfbfjpdj1ftz9", "mhfdxzqlgjfvfxvm7", "1rhznqnpgkqbtprvbb",
                              "rhxskjqrt2onemppcsktz6", "jhxsrxzgggfivetwofourseven9", "eightnjzddrjppq51twonebtl",
                              "2onesixonehlfmxkjpfxpkfkhbkjhcvjctfive8", "zv9three6djkfn6", "smx8", "fdrxeightj7three6dflczzmgdr",
                              "zvzrb5twosixtwo", "993oneseven5seven", "918ninetwotwoninefivesix", "1ljpljmninefivenine7eightwolsn",
                              "5bphjdgktwoseven4", "seven8six", "mjstvsjrltx3sevenkddd", "kljfvvmxkrkcctjpnmrveight7six",
                              "nineeight14dkkcsvg41seven", "dvxbzxxksonefjgfppsd1eight", "sixthreeqfbone8five929", "sgktnmjjseven5", "442",
                              "jbptworxzzmkhmszn1ninefour9", "lcfpbvkkgnggtkh8threeonefourtsvrrkcnvdpm", "81eighthgr", "jhklkvm6vqpvjdsh",
                              "lcgjdkm5578knninezsdcp7", "sixnineeight4", "qdlpnqm7mbtgbvqznteight6fzninecrrgqsq",
                              "tdmjfourfour8fiveseveneight", "1gdsthree", "threenine42onezctqjj8one", "ftfourone2onephv5",
                              "nbtwonexjpnqtlck5pxmfzbvp55eightfourbxzxrrstp", "sixnine2mpcldclfvklh5kmggqbtbk",
                              "1three4chsjrknhdtwoxqjcgssnq", "dcpjkkrthreeqpncsbfpmhtmtfvzjzmps8cltmhqzl4",
                              "2ninelrthreethreerzxqhdpcmfthreesix", "5nfsrrh1sevenlcnrblxjhjsmdndpthreevjphjqlznd",
                              "86kdqz8fhsxfkxvdseightmsrtrrc3", "1pmpzsjdqnm7eightfrzxtbxkdkdbzbxqlhg", "crpxxtwo7cck", "19hjngzt",
                              "58eight3twotwo1pqr", "onegmc3three7", "eightzbchgxsdpqfivejf3eightwoflt", "nnineninetkffffblkoneseven66",
                              "cgeightwodthree9pqkmkbbpvnthreeeight", "svjhcngvlksz4dnvfg", "twosixtfive7", "cfone9threemhvbpqrbbklfvreight6",
                              "eighttmltbk3hgtrtb", "two6t21nineslqmt6five", "dfoneightninegrxcgjmjdqlpdjskllzpltq2jgsix4",
                              "69threefourkqfzdpvtbxqpktwo6", "seveneight64four7", "72six4ntdhcphx48twonedbn", "tbbcskrmmj4", "xq9three28",
                              "scq9qbtzp", "four4ccftsmnxpj95one4threeone", "gvs286jvskvvzlhc6", "nspgkhf119fdcqjtzmlqqz", "eight1zqp",
                              "697ninenine4", "5jnnsgrhnmjmttbkql8", "seveneight5onesix9btbclcrrpzthree", "11eight5383",
                              "9321ddslmdlb5onefgdmz", "39twozhclzjfjgseven9", "eight6tqvrfmkxmhldbvv", "twogrldddksg1seven8",
                              "seven22dgjzqdlmmfvtxnnglqxbgfhgvglrg1", "oner676pkkmninegff", "3lvkxfive15qthpfivethree",
                              "fiveseventhree2llxsgzeight", "four3jftmvmqzql8nscjvph1seventhree5", "4chjvrninefour", "4ninenine46",
                              "sevennine7cgdnx", "7mfqtmpbnine", "38threefivebjjpgj", "kn4lpfd1four", "nine89krvcbcvqn", "2four62",
                              "8onehrrhxpmlpnfqtlxmfzps", "vzoneight2gkpfczjmht5zlfxmnkjfq", "mpdone5", "nv3ninetwo",
                              "mteightwot4sixfivefive2threesix9", "httwone2threefiveone3", "one9kphlcksfournrkxktxvz9bkfnq", "foursixone8",
                              "66crcjonetwo", "bcrsltzkd64eightcjzmctwoseven", "rplxlbpddneightvqdclxqqlh3hlkhkgrfvlnine",
                              "sixdjdhcvvnnccpsevenkhvqp1", "qjsevennineeight7three7four", "three5one2pzgbnmj1", "2kbbhjmseven464",
                              "eightseventhree3onevkmhmjvcd", "2rxdcjpzkph", "two9sevenpbhcbklcpnsixthree",
                              "seven9sevensix4zklllpckrxrcpctlgt", "5fivefiven6", "2fjffivesixgeightthree", "seven4pp5tpmcfourone",
                              "kftkjnhnms5hbngpqhxcone", "1dnrrsevenseven", "fhjcmxvpbsr99", "seven41threeckvp", "15twothree", "529two",
                              "xhtmrmdzkgsevenfkkzmqpgoneqqzdhpbdeight9", "ttnzmptlskm5pzvdnc15sqqcmmvx4", "7ndb", "55bxxpvjhkqdsixfour",
                              "14twochvtxrdcslbsrggcxvjpg", "2seventhree", "9cgfnrxprbz2ninejrhbgsczrhlxn6", "tfljdjcpltgzhmxv9",
                              "71ctrzxbkhhqpgc", "two1threeeightrskmzsmzhcdbxp2pztmgcg", "7eight6934", "five7lgspjnhrsmvmeightwolj",
                              "vtqcrtjmtkmvvnmmnineone87kclsrqrf", "5fivetslmronefdsdxr", "seven88", "gsvbn9fourtwo4zthfive",
                              "nqkgjlqgqbng5rxzbkhzmzcgkrsblfnqstxlcg", "9znzctbdftwonineone", "mrngnmkdjv48sevenvprcvllqqone",
                              "ninecxctvm5four621blbfctsg2", "seven6threehzhbmbthree2", "3fivethree", "sfsncqnp34twoxdmninenqqhdfour",
                              "four7gbcslngdx385lhkslcjhq5qjmvchc", "five4hnnkk31four", "7three8fivethree7onethree", "sjqpktfsn3tdjflb2",
                              "1ninegnone", "rvgcmzhffrntqqnhjxtxqrmvbsrteight34", "7slcmpmvhfhpzgllr5ktnzm7onevznhnnbrcc",
                              "269four1bzjrmheight3fgcr", "9seventhreefourzlqgjnrmq7xcmntjncntsixthlgq", "seveneight19fbphndppb8twonebbj",
                              "eightxblvnvrtpsmcngtbtltwo6heightprccv", "sixeightsix32", "49six7twonine2five", "25five5", "42onetwonbl",
                              "kbhrtpgnp6", "nsfktqkbzdcmgf28", "btwoeight982nine", "cpcrbqzmkbtcjmn58six", "one3hlgmgphkcnp", "74zpbzmxc",
                              "eightsevenseven36gdcnmrxn6vhvkmc5", "1nineninehkrsix", "threeqloneseven1", "eighthhq9cbptsljhzsevenhzpxm",
                              "8oneonebdthldf6eightthree", "7onefxlhzxcmhc4five8eightjlcms", "48skgslmflkhnpqtsix", "rgrdzx4sevenfive",
                              "onefxfxhslc9hjxkdqjs6threenine", "fivesevenonethree2sjnvt5", "92fivel83", "three2fivenlbtvsmvsix",
                              "threefive8nine", "mjnchtwosdbh7292three", "hdqffzseven3sevencqv", "73xcqzdt7jvkkskpgnine5",
                              "2threeninessgntvctkns2kqmcqdvjt", "dktgqszxcptlpxpzlsix8onetwoqlxk", "pbvvfjlzbseven2", "qtlfxzplrrcjfr6nine",
                              "7gsthreeplhxbbmrhtnine53rxpjghgjq", "2bmmjrzzjnz9dfplppnjmktzcsixrpqxcptskjkfqxgx", "fivedrtnxnjqxnt2qtbvlj",
                              "j88ninelnjlsnzsqk31rg", "hcfxflqvkvdfmthkjdpfzzlzzh4kdmmhvspzddfivethree", "5qsl",
                              "9eight3sixxvjktfzbpglmzfour37", "4six2", "zqrlljptwoone5knbhf72six6", "5k65blpldztzjh7sghcsdnpm8", "six48",
                              "skdpdfqtglzvlpqxp3twonelcr", "twoklhndseven6jdhcsccjgp68twonelb", "76four7nineeight",
                              "gntwoc59fivesevenninefour", "1nine64seven8", "seven4926four", "31gsjtkjdvjdqnrsgnpbnxsdrzmtskfdqhd",
                              "seven82ninetfnxhlxeightbt9", "xttqntsdmvfour8two", "zbjbeightfhbhcfkbhrthqhgsixthree11five",
                              "5sixpfnpmcpfppxvsfprxfbfcsevenfour", "25fourthreexgvhzdkzfh", "4xdpdpkldnbone",
                              "98sevendhjzlddn5ninetwobrfmbshn", "7783twonineeight", "1fourfour", "4fourztnthreeone8mqmdfour",
                              "fbfvqgvqfone5nctdcdpteighttwo", "dhfbhone4fourlgzftg")).toString());
    }

  @Test
  void testFindFirstDigit()
  {
      String[] findFirstDigitResults = {findFirstDigit("1abc2"), findFirstDigit("pqr3stu8vwx"), findFirstDigit(
              "a1b2c3d4e5f"), findFirstDigit("treb7uchet")};
      Approvals.verifyAll("First Digit", findFirstDigitResults);
  }

  @Test
  void testFindLastDigit()
  {
      String[] findLastDigitResults = {findLastDigit("1abc2"), findLastDigit("pqr3stu8vwx"), findLastDigit(
              "a1b2c3d4e5f"), findLastDigit("treb7uchet")};
      Approvals.verifyAll("Last Digit", findLastDigitResults);
  }

  @Test
  void testCalibrationValuePart1()
  {
      Approvals.verify(calibrationValuePart1(Arrays.asList("1abc2", "pqr3stu8vwx", "a1b2c3d4e5f", "treb7uchet")).toString());
  }

    @Test
    void testFindFirstNumberWord() {
        String[] findFirstNumberWordResults = {findFirstNumberWord("two1nine"), findFirstNumberWord("eightwothree"), findFirstNumberWord(
                "abcone2threexyz"), findFirstNumberWord("xtwone3four"), findFirstNumberWord("zoneight234")};
        Approvals.verifyAll("First Number Word", findFirstNumberWordResults);
    }

    @Test
    void testCalibrationValuePart2() {
        Approvals.verify(calibrationValuePart2(
                Arrays.asList("two1nine", "eightwothree", "abcone2threexyz", "xtwone3four", "4nineeightseven2", "zoneight234",
                              "7pqrstsixteen")).toString());
    }
}

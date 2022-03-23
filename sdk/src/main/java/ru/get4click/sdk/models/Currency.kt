package ru.get4click.sdk.models

class Currency(val currencyCode : String,
               val displayName : String? = null,val numericCode : Int? = 0,
               val symbol  : String? = null) {



     class CurLocale {
        // expect languageCode
    }

    companion object {


        val RUB  : Currency get() { return Currency("RUB","российский рубль",643,"₽") }
        val USD  : Currency get() { return Currency("USD","доллар США",840,"\$") }
        val SGD  : Currency get() { return Currency("SGD","сингапурский доллар",702,"SGD")}
        val ZAR  : Currency get() {  return Currency("ZAR","южноафриканский рэнд",710,"ZAR")}
        val UYW  : Currency get() {  return Currency("UYW","",927,"UYW")}
        val CRC  : Currency get() {  return Currency("CRC","костариканский колон",188,"CRC")}
        val XAU  : Currency get() {  return Currency("XAU","Золото",959,"XAU")}
        val XXX  : Currency get() {  return Currency("XXX","неизвестная валюта",999,"XXX")}
        val BYR  : Currency get() {  return Currency("BYR","Белорусский рубль (2000–2016)",974,"BYR")}
        val BYN  : Currency get() {  return Currency("BYN","Белорусский рубль",933,"BYN")}
        val GBP  : Currency get() {  return  Currency("BYR","британский фунт стерлингов",826,"£")}
        val EUR  : Currency get() {  return  Currency("EUR","евро",978,"€")}

    }

   /* SGD displayName= сингапурский доллар numericCode= 702 symbol= SGD
     южноафриканский рэнд numericCode= 710 symbol= ZAR
     UYW displayName= UYW numericCode= 927 symbol= UYW
 CRC displayName= костариканский колон numericCode= 188 symbol= CRC
   XAU displayName= Золото numericCode= 959 symbol= XAU
XOF displayName= франк КФА ВСЕАО numericCode= 952 symbol= CFA
  BND displayName= брунейский доллар numericCode= 96 symbol= BND
MVR displayName= мальдивская руфия numericCode= 462 symbol= MVR
LTT displayName= Литовский талон numericCode= 440 symbol= LTT
   MDC displayName= MDC numericCode= 0 symbol= MDC
   OMR displayName= оманский риал numericCode= 512 symbol= OMR
 AZN displayName= азербайджанский манат numericCode= 944 symbol= AZN
  MNT displayName= монгольский тугрик numericCode= 496 symbol= MNT
   HRK displayName= хорватская куна numericCode= 191 symbol= HRK
   UAK displayName= Карбованец (украинский) numericCode= 804 symbol= UAK
   CZK displayName= чешская крона numericCode= 203 symbol= CZK
   STD displayName= добра Сан-Томе и Принсипи (1977–2017) numericCode= 678 symbol= STD
   CNX displayName= CNX numericCode= 0 symbol= CNX
    ILR displayName= ILR numericCode= 376 symbol= ILR
   SDD displayName= Суданский динар numericCode= 736 symbol= SDD
   ZRN displayName= Новый заир numericCode= 180 symbol= ZRN
  ESB displayName= Испанская песета (конвертируемая) numericCode= 995 symbol= ESB
  NIC displayName= Никарагуанская кордоба (1988–1991) numericCode= 558 symbol= NIC
    LVR displayName= Латвийский рубль numericCode= 428 symbol= LVR
   KMF displayName= коморский франк numericCode= 174 symbol= KMF
   GWP displayName= Песо Гвинеи-Бисау numericCode= 624 symbol= GWP
    MVP displayName= MVP numericCode= 0 symbol= MVP
    ZMK displayName= Квача (замбийская) (1968–2012) numericCode= 894 symbol= ZMK
  BRR displayName= Бразильский крузейро numericCode= 987 symbol= BRR
GHS displayName= ганский седи numericCode= 936 symbol= GHS
 DKK displayName= датская крона numericCode= 208 symbol= DKK
TRL displayName= Турецкая лира (1922–2005) numericCode= 792 symbol= TRL
YUD displayName= Югославский твердый динар numericCode= 890 symbol= YUD
ETB displayName= эфиопский быр numericCode= 230 symbol= ETB
    KRO displayName= KRO numericCode= 0 symbol= KRO
    VNN displayName= VNN numericCode= 0 symbol= VNN
   TND displayName= тунисский динар numericCode= 788 symbol= TND
  CSK displayName= Чехословацкая твердая крона numericCode= 200 symbol= CSK
  AWG displayName= арубанский флорин numericCode= 533 symbol= AWG
    RHD displayName= Родезийский доллар numericCode= 716 symbol= RHD
   AMD displayName= армянский драм numericCode= 51 symbol= AMD
  MRU displayName= мавританская угия numericCode= 929 symbol= MRU
   CDF displayName= конголезский франк numericCode= 976 symbol= CDF
  BRL displayName= бразильский реал numericCode= 986 symbol= R$
   IRR displayName= иранский риал numericCode= 364 symbol= IRR
   SLL displayName= леоне numericCode= 694 symbol= SLL
   BYN displayName= белорусский рубль numericCode= 933 symbol= BYN
   GNS displayName= Гвинейская сили numericCode= 324 symbol= GNS
    SVC displayName= Сальвадорский колон numericCode= 222 symbol= SVC
     MCF displayName= MCF numericCode= 0 symbol= MCF
  SEK displayName= шведская крона numericCode= 752 symbol= SEK
GTQ displayName= гватемальский кетсаль numericCode= 320 symbol= GTQ
  NGN displayName= нигерийская найра numericCode= 566 symbol= NGN
    MUR displayName= маврикийская рупия numericCode= 480 symbol= MUR
   LKR displayName= шри-ланкийская рупия numericCode= 144 symbol= LKR
    BMD displayName= бермудский доллар numericCode= 60 symbol= BMD
    GHC displayName= Ганский седи (1979–2007) numericCode= 288 symbol= GHC
    BAM displayName= конвертируемая марка Боснии и Герцеговины numericCode= 977 symbol= BAM
   GMD displayName= гамбийский даласи numericCode= 270 symbol= GMD
   THB displayName= таиландский бат numericCode= 764 symbol= ฿
    GYD displayName= гайанский доллар numericCode= 328 symbol= GYD
   PES displayName= Перуанский соль (1863–1965) numericCode= 604 symbol= PES
   MAD displayName= марокканский дирхам numericCode= 504 symbol= MAD
   XXX displayName= неизвестная валюта numericCode= 999 symbol= XXXX
   XRE displayName= единица RINET-фондов numericCode= 0 symbol= XRE
BOP displayName= Боливийское песо numericCode= 68 symbol= BOP
 SDP displayName= Старый суданский фунт numericCode= 736 symbol= SDP
    MDL displayName= молдавский лей numericCode= 498 symbol= MDL
   BRC displayName= Бразильское крузадо numericCode= 76 symbol= BRC
 UGX displayName= угандийский шиллинг numericCode= 800 symbol= UGX
  BYR displayName= Белорусский рубль (2000–2016) numericCode= 974 symbol= BYR
  MWK displayName= малавийская квача numericCode= 454 symbol= MWK
   CHW displayName= WIR франк numericCode= 948 symbol= CHW
   BOL displayName= BOL numericCode= 0 symbol= BOL
    DZD displayName= алжирский динар numericCode= 12 symbol= DZD
     ALK displayName= ALK numericCode= 8 symbol= ALK
   AOA displayName= ангольская кванза numericCode= 973 symbol= AOA
   BBD displayName= барбадосский доллар numericCode= 52 symbol= BBD
  ARA displayName= Аргентинский аустрал numericCode= 32 symbol= ARA
   BYB displayName= Белорусский рубль (1994–1999) numericCode= 112 symbol= BYB
   XEU displayName= ЭКЮ (единица европейской валюты) numericCode= 954 symbol= XEU
   CUC displayName= кубинский конвертируемый песо numericCode= 931 symbol= CUC
    PHP displayName= филиппинский песо numericCode= 608 symbol= PHP
    BZD displayName= белизский доллар numericCode= 84 symbol= BZD
   SDG displayName= суданский фунт numericCode= 938 symbol= SDG
    YER displayName= йеменский риал numericCode= 886 symbol= YER
  ARM displayName= ARM numericCode= 0 symbol= ARM
     BRE displayName= Бразильский крузейро (1990–1993) numericCode= 76 symbol= BRE
    ALL displayName= албанский лек numericCode= 8 symbol= ALL
   SRD displayName= суринамский доллар numericCode= 968 symbol= SRD
   VUV displayName= вату Вануату numericCode= 548 symbol= VUV
   EGP displayName= египетский фунт numericCode= 818 symbol= EGP
  JOD displayName= иорданский динар numericCode= 400 symbol= JOD
    MZN displayName= мозамбикский метикал numericCode= 943 symbol= MZN
    VEB displayName= Венесуэльский боливар (1871–2008) numericCode= 862 symbol= VEB
    ARL displayName= ARL numericCode= 0 symbol= ARL
     ROL displayName= Старый Румынский лей numericCode= 642 symbol= ROL
    LSL displayName= Лоти numericCode= 426 symbol= LSL
    DOP displayName= доминиканский песо numericCode= 214 symbol= DOP
     CLF displayName= Условная расчетная единица Чили numericCode= 990 symbol= CLF
     VND displayName= вьетнамский донг numericCode= 704 symbol= ₫
    PAB displayName= панамский бальбоа numericCode= 590 symbol= PAB
     AZM displayName= Старый азербайджанский манат numericCode= 31 symbol= AZM
    PKR displayName= пакистанская рупия numericCode= 586 symbol= PKR
    TMM displayName= Туркменский манат numericCode= 795 symbol= TMM
    ERN displayName= эритрейская накфа numericCode= 232 symbol= ERN
    LUL displayName= Финансовый франк Люксембурга numericCode= 988 symbol= LUL
   ZAL displayName= Южноафриканский рэнд (финансовый) numericCode= 991 symbol= ZAL
    ISJ displayName= ISJ numericCode= 352 symbol= ISJ
   AFA displayName= Афгани (1927–2002) numericCode= 4 symbol= AFA
   LAK displayName= лаосский кип numericCode= 418 symbol= LAK
   MYR displayName= малайзийский ринггит numericCode= 458 symbol= MYR
  XFU displayName= Французский UIC-франк numericCode= 0 symbol= XFU
  SUR displayName= Рубль СССР numericCode= 810 symbol= SUR
 DJF displayName= франк Джибути numericCode= 262 symbol= DJF
   LTL displayName= Литовский лит numericCode= 440 symbol= LTL
   BIF displayName= бурундийский франк numericCode= 108 symbol= BIF
  ISK displayName= исландская крона numericCode= 352 symbol= ISK
 ESP displayName= Испанская песета numericCode= 724 symbol= ESP
 MXN displayName= мексиканский песо numericCode= 484 symbol= MX$
  MMK displayName= мьянманский кьят numericCode= 104 symbol= MMK
GBP displayName= британский фунт стерлингов numericCode= 826 symbol= £
  KES displayName= кенийский шиллинг numericCode= 404 symbol= KES
  ECV displayName= Постоянная единица стоимости Эквадора numericCode= 983 symbol= ECV
   EEK displayName= Эстонская крона numericCode= 233 symbol= EEK
   KRW displayName= южнокорейская вона numericCode= 410 symbol= ₩
  MAF displayName= Марокканский франк numericCode= 0 symbol= MAF
 SYP displayName= сирийский фунт numericCode= 760 symbol= SYP
   XBD displayName= расчетная единица европейского валютного соглашения (XBD) numericCode= 958 symbol= XBD
   XBA displayName= Европейская составная единица numericCode= 955 symbol= XBA
   SAR displayName= саудовский риял numericCode= 682 symbol= SAR
    TTD displayName= доллар Тринидада и Тобаго numericCode= 780 symbol= TTD
  ATS displayName= Австрийский шиллинг numericCode= 40 symbol= ATS
    GNF displayName= гвинейский франк numericCode= 324 symbol= GNF
  EUR displayName= евро numericCode= 978 symbol= €
JMD displayName= ямайский доллар numericCode= 388 symbol= JMD
  MKN displayName= MKN numericCode= 0 symbol= MKN
WST displayName= самоанская тала numericCode= 882 symbol= WST
    GEK displayName= Грузинский купон numericCode= 268 symbol= GEK
    HUF displayName= венгерский форинт numericCode= 348 symbol= HUF
   ZWD displayName= Доллар Зимбабве numericCode= 716 symbol= ZWD
AOR displayName= Ангольская кванза реюстадо (1995–1999) numericCode= 982 symbol= AOR
 INR displayName= индийская рупия numericCode= 356 symbol= ₹
  ESA displayName= Испанская песета (А) numericCode= 996 symbol= ESA
  LBP displayName= ливанский фунт numericCode= 422 symbol= LBP
SIT displayName= Словенский толар numericCode= 705 symbol= SIT
 ZMW displayName= замбийская квача numericCode= 967 symbol= ZMW
 COU displayName= Единица реальной стоимости Колумбии numericCode= 970 symbol= COU
    CAD displayName= канадский доллар numericCode= 124 symbol= CA$
   FIM displayName= Финская марка numericCode= 246 symbol= FIM
   BRB displayName= Бразильский новый крузейро (1967–1986) numericCode= 76 symbol= BRB
    MZM displayName= Старый мозамбикский метикал numericCode= 508 symbol= MZM
   PEN displayName= перуанский соль numericCode= 604 symbol= PEN
   BEL displayName= Бельгийский франк (финансовый) numericCode= 992 symbol= BEL
   TPE displayName= Тиморское эскудо numericCode= 626 symbol= TPE
  SRG displayName= Суринамский гульден numericCode= 740 symbol= SRG
   RUR displayName= Российский рубль (1991–1998) numericCode= 810 symbol= р.
   ITL displayName= Итальянская лира numericCode= 380 symbol= ITL
   XCD displayName= восточно-карибский доллар numericCode= 951 symbol= EC$
  YUM displayName= Югославский новый динар numericCode= 891 symbol= YUM
  KYD displayName= доллар Островов Кайман numericCode= 136 symbol= KYD
   XTS displayName= тестовый валютный код numericCode= 963 symbol= XTS
  TWD displayName= новый тайваньский доллар numericCode= 901 symbol= NT$
    BHD displayName= бахрейнский динар numericCode= 48 symbol= BHD
GWE displayName= Эскудо Португальской Гвинеи numericCode= 624 symbol= GWE
  XPD displayName= Палладий numericCode= 964 symbol= XPD
   BUK displayName= Джа numericCode= 104 symbol= BUK
   KRH displayName= KRH numericCode= 0 symbol= KRH
  KPW displayName= северокорейская вона numericCode= 408 symbol= KPW
   AFN displayName= афгани numericCode= 971 symbol= AFN
   HRD displayName= Хорватский динар numericCode= 191 symbol= HRD
    BTN displayName= бутанский нгултрум numericCode= 64 symbol= BTN
    MTL displayName= Мальтийская лира numericCode= 470 symbol= MTL
     NZD displayName= новозеландский доллар numericCode= 554 symbol= NZ$
     AON displayName= Ангольская новая кванза (1990–2000) numericCode= 24 symbol= AON
     TJS displayName= таджикский сомони numericCode= 972 symbol= TJS
    AED displayName= дирхам ОАЭ numericCode= 784 symbol= AED
    LUF displayName= Люксембургский франк numericCode= 442 symbol= LUF
  IDR displayName= индонезийская рупия numericCode= 360 symbol= IDR
    NPR displayName= непальская рупия numericCode= 524 symbol= NPR
    LUC displayName= Конвертируемый франк Люксембурга numericCode= 989 symbol= LUC
   GIP displayName= гибралтарский фунт numericCode= 292 symbol= GIP
    HNL displayName= гондурасская лемпира numericCode= 340 symbol= HNL
    CYP displayName= Кипрский фунт numericCode= 196 symbol= CYP
    FKP displayName= фунт Фолклендских островов numericCode= 238 symbol= FKP
    STN displayName= добра Сан-Томе и Принсипи numericCode= 930 symbol= STN
   XPF displayName= французский тихоокеанский франк numericCode= 953 symbol= CFPF
    CUP displayName= кубинский песо numericCode= 192 symbol= CUP
     RWF displayName= франк Руанды numericCode= 646 symbol= RWF
   SZL displayName= свазилендский лилангени numericCode= 748 symbol= SZL
    PYG displayName= парагвайский гуарани numericCode= 600 symbol= PYG
    BWP displayName= ботсванская пула numericCode= 72 symbol= BWP
    CNY displayName= китайский юань numericCode= 156 symbol= CN¥
    XFO displayName= Французский золотой франк numericCode= 0 symbol= XFO
     QAR displayName= катарский риал numericCode= 634 symbol= QAR
   CHF displayName= швейцарский франк numericCode= 756 symbol= CHF
     NAD displayName= доллар Намибии numericCode= 516 symbol= NAD
   RON displayName= румынский лей numericCode= 946 symbol= RON
   MGF displayName= Малагасийский франк numericCode= 450 symbol= MGF
    BRZ displayName= BRZ numericCode= 0 symbol= BRZ
    SHP displayName= фунт острова Святой Елены numericCode= 654 symbol= SHP
    ARP displayName= Аргентинское песо (1983–1985) numericCode= 32 symbol= ARP
   XPT displayName= Платина numericCode= 962 symbol= XPT
  TOP displayName= тонганская паанга numericCode= 776 symbol= TOP
  UYP displayName= Уругвайское старое песо (1975–1993) numericCode= 858 symbol= UYP
     BDT displayName= бангладешская така numericCode= 50 symbol= BDT
     CVE displayName= эскудо Кабо-Верде numericCode= 132 symbol= CVE
    DEM displayName= Немецкая марка numericCode= 276 symbol= DEM
    ADP displayName= Андоррская песета numericCode= 20 symbol= ADP
    UZS displayName= узбекский сум numericCode= 860 symbol= UZS
     KHR displayName= камбоджийский риель numericCode= 116 symbol= KHR
   XBC displayName= расчетная единица европейского валютного соглашения (XBC) numericCode= 957 symbol= XBC
    ZWR displayName= ZWR numericCode= 935 symbol= ZWR
   AUD displayName= австралийский доллар numericCode= 36 symbol= A$
    YUR displayName= YUR numericCode= 0 symbol= YUR
     BAN displayName= BAN numericCode= 0 symbol= BAN
    NLG displayName= Нидерландский гульден numericCode= 528 symbol= NLG
   VES displayName= венесуэльский боливар numericCode= 928 symbol= VES
   SSP displayName= южносуданский фунт numericCode= 728 symbol= SSP
     CHE displayName= WIR евро numericCode= 947 symbol= CHE
   YUN displayName= Югославский динар numericCode= 890 symbol= YUN
    CNH displayName= китайский офшорный юань numericCode= 0 symbol= CNH
     XAF displayName= франк КФА BEAC numericCode= 950 symbol= FCFA
   SCR displayName= сейшельская рупия numericCode= 690 symbol= SCR
    BGO displayName= BGO numericCode= 0 symbol= BGO
   MGA displayName= малагасийский ариари numericCode= 969 symbol= MGA
   USS displayName= Доллар США текущего дня numericCode= 998 symbol= USS
XBB displayName= Европейская денежная единица numericCode= 956 symbol= XBB
    BOV displayName= Боливийский мвдол numericCode= 984 symbol= BOV
    CLE displayName= CLE numericCode= 0 symbol= CLE
     FJD displayName= доллар Фиджи numericCode= 242 symbol= FJD
  HKD displayName= гонконгский доллар numericCode= 344 symbol= HK$
ILP displayName= Израильский фунт numericCode= 376 symbol= ILP
   FRF displayName= Французский франк numericCode= 250 symbol= FRF
     MTP displayName= Мальтийский фунт numericCode= 470 symbol= MTP
     KWD displayName= кувейтский динар numericCode= 414 symbol= KWD
   UAH displayName= украинская г��ивна numericCode= 980 symbol= грн.
  AOK displayName= Ангольская кванза (1977–1990) numericCode= 24 symbol= AOK
     CSD displayName= Старый Сербский динар numericCode= 891 symbol= CSD
     TMT displayName= новый туркменский манат numericCode= 934 symbol= ТМТ
     KGS displayName= киргизский сом numericCode= 417 symbol= KGS
    XAG displayName= Серебро numericCode= 961 symbol= XAG
     ILS displayName= новый израильский шекель numericCode= 376 symbol= ₪
    IQD displayName= иракский динар numericCode= 368 symbol= IQD
   SBD displayName= доллар Соломоновых Островов numericCode= 90 symbol= SBD
    SOS displayName= сомалийский шиллинг numericCode= 706 symbol= SOS
   PTE displayName= Португальское эскудо numericCode= 620 symbol= PTE
    BSD displayName= багамский доллар numericCode= 44 symbol= BSD
     SKK displayName= Словацкая крона numericCode= 703 symbol= SKK
     USN displayName= Доллар США следующего дня numericCode= 997 symbol= USN
    ECS displayName= Эквадорский сукре numericCode= 218 symbol= ECS
   BEF displayName= Бельгийский франк numericCode= 56 symbol= BEF
    BGL displayName= Лев numericCode= 100 symbol= BGL
   VEF displayName= венесуэльский боливар (2008–2018) numericCode= 937 symbol= VEF
    BGN displayName= болгарский лев numericCode= 975 symbol= BGN
   TZS displayName= танзанийский шиллинг numericCode= 834 symbol= TZS
     MKD displayName= македонский денар numericCode= 807 symbol= MKD
     KZT displayName= казахский тенге numericCode= 398 symbol= KZT
     CLP displayName= чилийский песо numericCode= 152 symbol= CLP

    NIO displayName= никарагуанская кордоба numericCode= 558 symbol= NIO
    PLZ displayName= Злотый numericCode= 616 symbol= PLZ
    LYD displayName= ливийский динар numericCode= 434 symbol= LYD
   PEI displayName= Перуанское инти numericCode= 604 symbol= PEI
    HTG displayName= гаитянский гурд numericCode= 332 symbol= HTG
    UGS displayName= Старый угандийский шиллинг numericCode= 800 symbol= UGS
    ARS displayName= аргентинский песо numericCode= 32 symbol= ARS
  GQE displayName= Эквеле экваториальной Гвинеи numericCode= 226 symbol= GQE
  BAD displayName= Динар Боснии и Герцеговины numericCode= 70 symbol= BAD
   BOB displayName= боливийский боливиано numericCode= 68 symbol= BOB
     NOK displayName= норвежская крона numericCode= 578 symbol= NOK
    YDD displayName= Йеменский динар numericCode= 720 symbol= YDD
    BEC displayName= Бельгийский франк (конвертируемый) numericCode= 993 symbol= BEC
   COP displayName= колумбийский песо numericCode= 170 symbol= COP
     MRO displayName= мавританская угия (1973–2017) numericCode= 478 symbol= MRO
    BGM displayName= BGM numericCode= 0 symbol= BGM
     IEP displayName= Ирландский фунт numericCode= 372 symbol= IEP
    BRN displayName= Бразильское новое крузадо numericCode= 76 symbol= BRN
   XSU displayName= XSU numericCode= 994 symbol= XSU
     XUA displayName= XUA numericCode= 965 symbol= XUA
     MZE displayName= Мозамбикское эскудо numericCode= 508 symbol= MZE
     TRY displayName= турецкая лира numericCode= 949 symbol= TRY
    GEL displayName= грузинский лари numericCode= 981 symbol= GEL
  ZRZ displayName= Заир numericCode= 180 symbol= ZRZ
 DDM displayName= Восточногерманская марка numericCode= 278 symbol= DDM
    LVL displayName= Латвийский лат numericCode= 428 symbol= LVL
     ZWL displayName= Доллар Зимбабве (2009) numericCode= 932 symbol= ZWL
    LRD displayName= либерийский доллар numericCode= 430 symbol= LRD
    MLF displayName= Малийский франк numericCode= 466 symbol= MLF
    XDR displayName= СДР (специальные права заимствования) numericCode= 960 symbol= XDR
  ANG displayName= нидерландский антильский гульден numericCode= 532 symbol= ANG
     MOP displayName= патака Макао numericCode= 446 symbol= MOP
    JPY displayName= японская иена numericCode= 392 symbol= ¥
    MXV displayName= Мексиканская пересчетная единица (UDI) numericCode= 979 symbol= MXV
     GRD displayName= Греческая драхма numericCode= 300 symbol= GRD
    PGK displayName= кина Папуа – Новой Гвинеи numericCode= 598 symbol= PGK
    PLN displayName= польский злотый numericCode= 985 symbol= PLN
     UYI displayName= Уругвайский песо (индекс инфляции) numericCode= 940 symbol= UYI
    MXP displayName= Мексиканское серебряное песо (1861–1992) numericCode= 484 symbol= MXP
     UYU displayName= уругвайский песо numericCode= 858 symbol= UYU
    TJR displayName= Таджикский рубль numericCode= 762 symbol= TJR
    RSD displayName= сербский динар numericCode= 941 symbol= RSD*/
}
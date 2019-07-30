$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/AddcustomerTrafPalnonemaplist.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@rgression"
    }
  ]
});
formatter.scenario({
  "name": "To check add tarif functionalities",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@rgression"
    },
    {
      "name": "@blackbox"
    }
  ]
});
formatter.step({
  "name": "User view home page",
  "keyword": "Given "
});
formatter.match({
  "location": "AddcustomerTrafPalnonemaplist.user_view_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user click Add tariff plan",
  "keyword": "And "
});
formatter.match({
  "location": "AddcustomerTrafPalnonemaplist.user_click_Add_tariff_plan()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User need to fill all the fieldss",
  "rows": [
    {
      "cells": [
        "Monthly",
        "500"
      ]
    },
    {
      "cells": [
        "Free local minutes",
        "100"
      ]
    },
    {
      "cells": [
        "Free inter min",
        "50"
      ]
    },
    {
      "cells": [
        "Free sms",
        "100"
      ]
    },
    {
      "cells": [
        "Loc per min",
        "200"
      ]
    },
    {
      "cells": [
        "Inter natio per min",
        "40"
      ]
    },
    {
      "cells": [
        "Sms per charge",
        "10"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AddcustomerTrafPalnonemaplist.user_need_to_fill_all_the_fieldss(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User need to click submit button",
  "keyword": "And "
});
formatter.match({
  "location": "AddcustomerTrafPalnonemaplist.user_need_to_click_submit_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should see the new tarif plan added page",
  "keyword": "Then "
});
formatter.match({
  "location": "AddcustomerTrafPalnonemaplist.user_should_see_the_new_tarif_plan_added_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("src/test/resources/Addonedimenlist.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "To Check add customer functionalities",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "User is in telecom home pages",
  "keyword": "Given "
});
formatter.match({
  "location": "CucumberOneDimenList.user_is_in_telecom_home_pages()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User click on add customer buttons",
  "keyword": "And "
});
formatter.match({
  "location": "CucumberOneDimenList.user_click_on_add_customer_buttons()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User filling the all detailss",
  "rows": [
    {
      "cells": [
        "Moha",
        "Iq",
        "Te@mail.com",
        "che",
        "1234"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "CucumberOneDimenList.user_filling_the_all_detailss(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User is submitting the detailss",
  "keyword": "And "
});
formatter.match({
  "location": "CucumberOneDimenList.user_is_submitting_the_detailss()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User is able to see customer IDenerated is generatedd",
  "rows": [
    {
      "cells": []
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "CucumberOneDimenList.user_is_able_to_see_customer_IDenerated_is_generatedd(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("src/test/resources/Traftwodimmap.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file\n  \n Backgroud\n  Given User is in home page\n  And User able to click tariff button",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Title of your scenario",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User need to fill tariff details",
  "keyword": "When "
});
formatter.match({
  "location": "tTrafTwodimlmap.user_need_to_fill_tariff_details(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "need click submit button",
  "rows": [
    {
      "cells": [
        "MonRen",
        "Freeloc",
        "Freeinter",
        "Freesms",
        "Locper",
        "Interper",
        "Sms"
      ]
    },
    {
      "cells": [
        "188",
        "345",
        "222",
        "123",
        "923",
        "768",
        "654"
      ]
    },
    {
      "cells": [
        "545",
        "656",
        "555",
        "435",
        "898",
        "323",
        "666"
      ]
    },
    {
      "cells": [
        "333",
        "111",
        "666",
        "322",
        "676",
        "333",
        "123"
      ]
    },
    {
      "cells": [
        "125",
        "099",
        "789",
        "777",
        "555",
        "343",
        "777"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Tartwodimlist.need_click_submit_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "need to fill tariff detailss\"\u003cMonRen\u003e\",\"\u003cFreeloc\u003e\",\"\u003cFreeinter\u003e\",\"\u003cFreesms\u003e\",\"\u003cLocper\u003e\",\"\u003cInterper\u003e\",\"\u003cSms\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "need click submit buttons",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "MonRen",
        "Freeloc",
        "Freeinter",
        "Freesms",
        "Locper",
        "Interper",
        "Sms"
      ]
    },
    {
      "cells": [
        "233",
        "123",
        "999",
        "123",
        "923",
        "768",
        "654"
      ]
    },
    {
      "cells": [
        "123",
        "222",
        "555",
        "435",
        "898",
        "323",
        "666"
      ]
    },
    {
      "cells": [
        "333",
        "344",
        "666",
        "322",
        "676",
        "333",
        "123"
      ]
    },
    {
      "cells": [
        "332",
        "111",
        "789",
        "777",
        "555",
        "343",
        "777"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "need to fill tariff detailss\"233\",\"123\",\"999\",\"123\",\"923\",\"768\",\"654\"",
  "keyword": "When "
});
formatter.match({
  "location": "tTrafTwodimlmap.need_to_fill_tariff_detailss(String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "need click submit buttons",
  "keyword": "And "
});
formatter.match({
  "location": "tTrafTwodimlmap.need_click_submit_buttons()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "need to fill tariff detailss\"123\",\"222\",\"555\",\"435\",\"898\",\"323\",\"666\"",
  "keyword": "When "
});
formatter.match({
  "location": "tTrafTwodimlmap.need_to_fill_tariff_detailss(String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "need click submit buttons",
  "keyword": "And "
});
formatter.match({
  "location": "tTrafTwodimlmap.need_click_submit_buttons()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "need to fill tariff detailss\"333\",\"344\",\"666\",\"322\",\"676\",\"333\",\"123\"",
  "keyword": "When "
});
formatter.match({
  "location": "tTrafTwodimlmap.need_to_fill_tariff_detailss(String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "need click submit buttons",
  "keyword": "And "
});
formatter.match({
  "location": "tTrafTwodimlmap.need_click_submit_buttons()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "need to fill tariff detailss\"332\",\"111\",\"789\",\"777\",\"555\",\"343\",\"777\"",
  "keyword": "When "
});
formatter.match({
  "location": "tTrafTwodimlmap.need_to_fill_tariff_detailss(String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "need click submit buttons",
  "keyword": "And "
});
formatter.match({
  "location": "tTrafTwodimlmap.need_click_submit_buttons()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("src/test/resources/Triftwodimlist.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Title of your scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "need to tarif details",
  "rows": [
    {
      "cells": [
        "244",
        "332",
        "212",
        "123",
        "321",
        "13",
        "332"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Tartwodimlist.need_to_tarif_details(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "need click submit button",
  "keyword": "And "
});
formatter.match({
  "location": "Tartwodimlist.need_click_submit_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User view the successful page",
  "keyword": "Then "
});
formatter.match({
  "location": "Tartwodimlist.user_view_the_successful_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Title of your scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "check tarif detailss",
  "rows": [
    {
      "cells": [
        "241",
        "332",
        "212",
        "123",
        "322",
        "123",
        "167"
      ]
    },
    {
      "cells": [
        "244",
        "337",
        "562",
        "123",
        "321",
        "122",
        "789"
      ]
    },
    {
      "cells": [
        "242",
        "339",
        "232",
        "123",
        "444",
        "134",
        "332"
      ]
    },
    {
      "cells": [
        "243",
        "338",
        "122",
        "123",
        "212",
        "123",
        "234"
      ]
    },
    {
      "cells": [
        "100",
        "234",
        "675",
        "777",
        "125",
        "656",
        "098"
      ]
    },
    {
      "cells": [
        "122",
        "212",
        "567",
        "888",
        "878",
        "888",
        "545"
      ]
    },
    {
      "cells": [
        "143",
        "132",
        "324",
        "103",
        "987",
        "166",
        "655"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Tartwodimlist.check_tarif_detailss(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click submit button",
  "keyword": "And "
});
formatter.match({
  "location": "Tartwodimlist.click_submit_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User view the successful page",
  "keyword": "Then "
});
formatter.match({
  "location": "Tartwodimlist.user_view_the_successful_page()"
});
formatter.result({
  "status": "skipped"
});
});
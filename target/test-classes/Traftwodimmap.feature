Feature: Title of your feature
  I want to use this template for my feature file
  
 Backgroud
  Given User is in home page
  And User able to click tariff button

  
  Scenario: Title of your scenario
    When User need to fill tariff details
    And need click submit button
    |MonRen	|Freeloc|Freeinter|Freesms|Locper	|Interper|Sms|
    |188		|345		|222			|123		|923		|768		 |654|
    |545		|656		|555			|435		|898		|323		 |666|
    |333		|111		|666			|322		|676		|333		 |123|
    |125		|099		|789			|777		|555		|343		 |777|

  
  Scenario Outline: Title of your scenario outline
    
     When need to fill tariff detailss"<MonRen>","<Freeloc>","<Freeinter>","<Freesms>","<Locper>","<Interper>","<Sms>"
    And need click submit buttons

    Examples:
    |MonRen|Freeloc|Freeinter |Freesms |Locper|Interper|Sms |
    |233	 |123		 |999			  |123		 |923		|768		 |654 |
    |123	 |222		 |555			  |435		 |898		|323		 |666 |
    |333	 |344		 |666			  |322		 |676		|333		 |123 |
    |332	 |111		 |789			  |777		 |555		|343		 |777 |
    
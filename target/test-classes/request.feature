Feature: Performing Api request on Sample Apis

  @getAllPosts
  Scenario: implementing Get request
    When I hit the Get posts api
    Then I should see all the posts available


   @getSinglePost
   Scenario: implementing get request to get post of an individual user
     When  I hit the single get user request
     Then  I should be able to see a single user id
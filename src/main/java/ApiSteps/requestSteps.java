package ApiSteps;

import apiPage.requestPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class requestSteps  {
    requestPage rPage = new requestPage();


    @When("^I hit the Get posts api$")
    public void i_hit_the_Get_posts_api() throws Throwable {
        rPage.get_response();
    }

    @Then("^I should see all the posts available$")
    public void i_should_see_all_the_posts_available() {
        Assert.assertTrue( "post not available",rPage.verifyPostAvailable());

    }

    @When("^I hit the single get user request$")
    public void i_hit_the_single_get_user_request() throws Throwable  {
        rPage.get_response_single_req();


    }

    @Then("^I should be able to see a single user id$")
    public void i_should_be_able_to_see_a_single_user_id() {
        Assert.assertTrue("single post not available" ,rPage.verifySinglePostAvailable());


    }


}

package com.manchesterdigital.bootcamp;

import org.junit.Test;

public class MusifyTest {
    /* Musify is a new start up and would like to introduce a new service where people can share music
    amongst their friends and create shared music playlists.
    To allow this to happen, the business would like a way of allowing users to be managed on the service.
    Requirements
       Given a user ...
          When a user provides a first name, last name, email address and password, then user should be created.
          When a user provides an email address and password then user will be authenticated
    Extras:
    When a user provides an email address and password and they choose to use a third party authenticator then authentication performed.
    Authentication must use the following sponsor authentication mechanisms:
    Sponsor
    Facebook
    Google
    Instagram
     */

    @Test
    public void userCreatedWhenProvidingFirstNameLastNameEmailAndPassword() {
        // Arrange

        // act. MusifyTest.provideDetails("Johanna", "Longmuir", "jl@gmail.com", "password");

        // assert. new user contains ("Johanna", "Longmuir", "jl@gmail.com", "password");
    }
}

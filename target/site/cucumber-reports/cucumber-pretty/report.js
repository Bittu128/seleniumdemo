$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/MyTest2.feature");
formatter.feature({
  "line": 1,
  "name": "Reset functionality on login page of Application",
  "description": "",
  "id": "reset-functionality-on-login-page-of-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Verification of Reset button",
  "description": "",
  "id": "reset-functionality-on-login-page-of-application;verification-of-reset-button",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "Open the Firefox and launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "Enter the Username and Password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 11
    },
    {
      "cells": [
        "User1",
        "password1"
      ],
      "line": 13
    },
    {
      "cells": [
        "User2",
        "password2"
      ],
      "line": 15
    },
    {
      "cells": [
        "User3",
        "password3"
      ],
      "line": 17
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "Reset the credential",
  "keyword": "Then "
});
formatter.match({
  "location": "ResetCredentials.open_the_Firefox_and_launch_the_application()"
});
formatter.result({
  "duration": 13465205013,
  "status": "passed"
});
formatter.match({
  "location": "ResetCredentials.enter_the_Username_and_Password(DataTable)"
});
formatter.result({
  "duration": 2597549335,
  "status": "passed"
});
formatter.match({
  "location": "ResetCredentials.Reset_the_credential()"
});
formatter.result({
  "duration": 13851383,
  "status": "passed"
});
});
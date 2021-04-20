# Software-Security-Artemis-Financial

## Briefly summarize your client, Artemis Financial, and their software requirements. Who was the client? What issue did they want you to address?

Artemis Financial, a financial consulting company that develops individualized financial plans for savings, retirement, investments, and insurance for their patrons, wants to modernize their operations. Althought they already have a public web interface, they are seeking help in implementing and applying the most current and effective software security. They want to ensure that their client data and financial information is properly protected. Specifically, Artemis Financial wants to add a file verification step to their web application to ensure secure communications to be done in the form of a checksum. 

## What did you do particularly well in identifying their software security vulnerabilities? Why is it important to code securely? What value does software security add to a company’s overall wellbeing?

I identified the dependency vulnerabilities particularly well. Most of the vulnerabilities occured because of older versions of the software and by simply overriding the version throught the pom file. Only two vulnerabilities needed to be surpressed due to not having a current fix. Once all this was completed, the vulnerability check came back completely clear. Coding securely means that you are consciously making sure that all your code is written securly as well as implemented securely. Security for a company is one of the most important, if not the most important, aspect when considering any online interactions between client and server. If a company has security vulnerabilities then 

# Software-Security-Artemis-Financial

## Briefly summarize your client, Artemis Financial, and their software requirements. Who was the client? What issue did they want you to address?

Artemis Financial, a financial consulting company that develops individualized financial plans for savings, retirement, investments, and insurance for their patrons, wants to modernize their operations. Althought they already have a public web interface, they are seeking help in implementing and applying the most current and effective software security. They want to ensure that their client data and financial information is properly protected. Specifically, Artemis Financial wants to add a file verification step to their web application to ensure secure communications to be done in the form of a checksum. 

## What did you do particularly well in identifying their software security vulnerabilities? Why is it important to code securely? What value does software security add to a company’s overall wellbeing?

I identified the dependency vulnerabilities particularly well. Most of the vulnerabilities occured because of older versions of the software and by simply overriding the version throught the pom file. Only two vulnerabilities needed to be surpressed due to not having a current fix. Once all this was completed, the vulnerability check came back completely clear. Coding securely means that you are consciously making sure that all your code is written securly as well as implemented securely. Security for a company is one of the most important, if not the most important, aspect when considering any online interactions between client and server. If a company has security vulnerabilities then they are likely to be attacked by hackers. This is especially more likely for any companies that deal with money. If a company doesn't provide complete security for their clients then it will likely not succeed.

## What about the process of working through the vulnerability assessment did you find challenging or helpful?

Working through the assessment I found that you have to use your own judgement on some things which can make it a bit challenging, especially when I first started. once I felt more confident it became easier because I grew to better understand how vulnerabilities affect everything. 

## How did you approach the need to increase layers of security? What techniques or strategies would you use in the future to assess vulnerabilities and determine mitigation techniques?

I understood that Artemis Financial wanted to make sure security was up to today's standards. This lead to research on the best algorithm ciphers, best coding techniques and vulnerabilities. Once I understood what would be the best choice for Artemis Financial I implemented it. In the future my first and foremost assessment of vulnerabilites would be to determine the version of all dependencies. Just like how we keep our computer up to date, the same is needed for all the security dependencies. 

## How did you ensure the code and software application were functional and secure? After refactoring code, how did you check to see whether you introduced new vulnerabilities?

I checked for vulnerabilites with the OWASP dependency check. As I updated all the vulnerable dependencies more did come up with the same code which told me they needed to be updated as well. After every override I did I ran the dependency check as well as running the program to ensure that it was still functional and secure. I continued to override versions until I no longer received any code errors. 

## What resources, tools, or coding practices did you employ that you might find helpful in future assignments or tasks?

The OWASP dependency check was really helpful and so was their website for figuring out vulnerabilites. A lot of my research was through Google and using resources provided in this class to help with employing secure coding practices and figure out how to fix vulnerabilites. I would definitely use these resources in future assignemnts and tasks.

## Employers sometimes ask for examples of work that you have successfully completed to demonstrate your skills, knowledge, and experience. What from this particular assignment might you want to showcase to a future employer?

From this particular assignment I would probably showcase my pom file and code implementation. I remember when I first worked with the pom file I was very confused on how it worked since I didn't have too much experience with HTML. Even just implementing the OWASP dependency plugin took me a bit to figure out but I realized how it works afterwards and found it much simpler than I originally thought. I enjoyed pushing out the overrides to versions and suppressing errors to clean up the vulnerabilities. Implementing the code and seeing it work as intended is always satisfying and I was really happy to see it function as intended with the self-signed certificate and without vulnerabilities.  

from selenium import webdriver
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.firefox import GeckoDriverManager
from selenium.webdriver.common.by import By


service = FirefoxService(GeckoDriverManager().install())

with webdriver.Firefox(service=service) as driver: 

    # Open the browser to a URL
    driver.get("https://training-support.net")
    
    #Print the title of the page
    print(f"The title of the page is: {driver.title}")
    print(f"Current url of the page is: {driver.current_url}")

    driver.find_element(By.LINK_TEXT, "About Us").click()



    #Close the browser
    driver.quit();

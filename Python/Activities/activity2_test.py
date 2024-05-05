from selenium import webdriver
from utilities.BaseClass import BaseClass


class page_title(BaseClass):
  def test_home_page(self):
    #self.driver.get("http://alchemy.hguy.co/crm")
    assert self.driver.title == "SuiteCRM1"
    print("***Test Ended***")



"""
class page_title:
  
  def test_home_page(self, setup):
        self.driver = setup
        self.driver.get("http://alchemy.hguy.co/crm")
        assert self.driver.title == "SuiteCRM"
        print("***Test Ended***")
        """
  
  

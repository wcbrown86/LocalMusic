"""
    Author:     William Chad Brown
    Company:    Brown Sound Tech
    Date:       September 2018
    Version:    0.1

    About:      This Application is designed to search webpages for information about concert 
                dates and times. This information will be stored with the information containing 
                the bands/ ticket price/ date/ time/ and links to the bands webpages/music. 

    TODO:       1. Set up and test the program searching one venues page.
                    Venues to test with, 
                        The Fillmore - uses LiveNation for calender information
                        The Evening Muse - 
                        Visulite Theatre - 
                        The Rabbit Hole - 
                        AvidXchange Music Factory - 
                        The Milestone Club - 
                        Neighborhood Theatre - 
                        Petra's Bar - 
                        PNC Music Pavilion - 
                        The Underground - 
                        Charlotte Metro Credit Union Amphitheatre - 
                        Tin Roof - 
                2. Set up and access a database for storage of the information gathered. 
                

"""
import requests
from requests.exceptions import RequestException
from contextlib import closing
from bs4 import BeautifulSoup

r = requests.get("http://www.fillmorenc.com")
print("Status", r.status_code)

f = open("./page.html", "w+")
f.write(r.text)
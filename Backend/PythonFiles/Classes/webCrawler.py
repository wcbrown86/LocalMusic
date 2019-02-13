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
                        Neighborhood Theatre - Information on the website, google events, ticketfly
                        Petra's Bar - 
                        PNC Music Pavilion - LiveNation owned Venue
                        The Underground - No Website, uses LiveNation for calender information.
                        Charlotte Metro Credit Union Amphitheatre - 
                        Tin Roof - Website is just a signle PDF that shows the menu, no calender 
                                   for bands. 
                2. Set up and access a database for storage of the information gathered. 
                

"""
import requests
from requests.exceptions import RequestException
from contextlib import closing
from bs4 import BeautifulSoup

r = requests.get("https://themilestone.club/calendar/")
print("Status", r.status_code)

f = open("./page.html", "w+")
f.write(r.text)
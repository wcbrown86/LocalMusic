"""
    Author:     William Chad Brown
    Company:    Brown Sound Tech
    Date:       September 2018
    Version:    0.1

    About:      This Application is designed to search webpages for information about concert 
                dates and times. This information will be stored with the information containing 
                the bands/ ticket price/ date/ time/ and links to the bands webpages/music. 

    TODO:       1. Set up and test the program searching one venues page. 
                2. Set up and access a database for storage of the information gathered. 
                

"""
from requests import get
from requests.exceptions import RequestException
from contextlib import closing
from bs4 import BeautifulSoup
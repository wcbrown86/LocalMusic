"""
    Author: William Chad Brown
    Date: 09/23/2018

    Description:    This Class is used to check the Live Nation API for events.
    
    TODO:               
"""

from Venues import Venues

import json
import urllib

class LiveNation:

    def __init__(self, venue):

        self.key = "huk5WDVW6kgR9bt0WVXGGHExyyAF5UlX"
        self.venue = venue
        self.id = venue.getLiveNationID()

    
    def getVenus(self, vState):

        url = "https://app.ticketmaster.com/discovery/v2/venues.json?stateCode=" + vState + "&apikey=" + self.key
        
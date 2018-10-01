"""
    Author: William Chad Brown
    Date: 09/23/2018

    Description:    This Class is used to check the Live Nation API for events.
    
    TODO:               
"""

from Venues import Venues
class LiveNation:

    def __init__(self, venue):

        self.venue = venue
        self.id = venue.getLiveNationID()
        
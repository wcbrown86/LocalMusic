"""
    Author: William Chad Brown
    Date: 09/23/2018

    Description:    This Class is used to check the Live Nation API for events.
    
    TODO:               
"""

from Venues import Venues
class LiveNation:

    def __init__(self, venue):

        self.key = "huk5WDVW6kgR9bt0WVXGGHExyyAF5UlX"
        self.venue = venue
        self.id = venue.getLiveNationID()
        
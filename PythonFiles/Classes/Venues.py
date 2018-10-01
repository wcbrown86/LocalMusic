from LiveNation import LiveNation

class Venues:

    def __init__(self, vName, vState, vCity, vWebsite):

        self.name = vName
        self.state = vState
        self.city = vCity
        self.website = vWebsite
        self.liveNation = False
        self.liveNationID = ""
        self.geoLocation = ""
        self.events = {}
       
    def setLiveNation(self, vID):
        self.liveNation = True
        self.liveNationID = vID

    
    def getLiveNationID(self):
        return self.liveNationID

    



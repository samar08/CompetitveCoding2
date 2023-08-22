def preprocessDate(dates):
    day,month,year=dates.split(" ")
    
    monthdict={}
    monthdict["jan"]="01"
    monthdict["feb"]="02"
    monthdict["mar"]="03"
    monthdict["apr"]="04"
    monthdict["may"]="05"
    monthdict["jun"]="06"
    monthdict["jul"]="07"
    monthdict["aug"]="08"
    monthdict["sep"]="09"
    monthdict["oct"]="10"
    monthdict["nov"]="11"
    monthdict["dec"]="12"
    day=day[0:len(day)-2]
    if(len(day)==1):
        day="0"+day
    month=monthdict[(month.lower())]
    return year+"-"+month+"-"+day



if __name__== "__main__":
    dates=input()
    print(preprocessDate(dates))

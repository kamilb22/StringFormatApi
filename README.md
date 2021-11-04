
# StringFormatApi
In order to run this API you have to run String-API. 

# `GET` /lowerCase/{string}
>Counts how many lowercase letters are in the text
 
| parameter | description |
|--|--|
| string | the text to be processed |

**example** `200`
 `GET` /lowerCase/Ala Ma Kota

    6
# `GET` /upperCase/{string}
>Counts how many uppercase letters are in the text
 
| parameter | description |
|--|--|
| string | the text to be processed |

**example** `200`
 `GET` /upperCase/Ala Ma Kota

    3
# `GET` /numbers/{string}
>Counts how many numbers are in the text
> 
| parameter | description |
|--|--|
| string | the text to be processed |

**example** `200`
 `GET` /numbers/Ala1 Ma Kota6

    2
# `GET` /special/{string}
>Counts how many special characters are in the text
>
| parameter | description |
|--|--|
| string | the text to be processed |

**example** `200`
 `GET` /special/Ala1_ Ma Kota6$_<>
 
    5
    
 

## Data Format

| parameter | description |
|--|--|
| mode| Response format. Possible values are `json`, `xml` and `csv`. If you don't use the `mode` parameter format is JSON by default.|

**example** `200`
 `GET` /numbers/Ala1 Ma Kota6?mode=json
 
    {
	 "result": 2
    }
    
   ---
**example** `200`
 `GET` /numbers/Ala1 Ma Kota6?mode=xml
 
    <result>2</result>

   ---
**example** `200`
 `GET` /numbers/Ala1 Ma Kota6?mode=csv
 
    "result"
	2

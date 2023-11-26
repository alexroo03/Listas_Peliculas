package com.example.listas

class FilmProvider {
    companion object{
        val filmList = listOf<Film>(
            Film(
        title = "Lighyear",
        director = "Angus MacLane",
        year = 2022,
        photo = "data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAkGBwgHBgkIBwgKCgkLDRYPDQwMDRsUFRAWIB0iIiAdHx8kKDQsJCYxJx8fLT0tMTU3Ojo6Iys/RD84QzQ5OjcBCgoKDQwNGg8PGjclHyU3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3N//AABEIADgAJgMBIgACEQEDEQH/xAAbAAACAwEBAQAAAAAAAAAAAAAABwQFBgMCAf/EADIQAAIBAwMCBAMGBwAAAAAAAAECAwAEEQUSIRMxBkFRYSIygQcUQnGRsRUWIzNiocL/xAAZAQACAwEAAAAAAAAAAAAAAAABAwAEBQL/xAAhEQACAgEDBQEAAAAAAAAAAAABAgADERIhMQQTIkFRwf/aAAwDAQACEQMRAD8AVMVm12i9OIhlADe9TLLSbkxSEwvsTJLY44GasPCl6UZklDyxupGCBx9a2QurTTY3n1W4jt7Z42FsvS3dRx+JuCcYOT5HgVt09GopFrcSpY3lhYvYdNu2nZGhRRvVMrIpySMjbgndx6Z98V3FhdQuyi3eMNwNw5xTC+zxIJ4p1urtZTGoeZ5W5ZhxnOe3OR6YGK8azZTW0MzOUnt0cdCfI3FSMjBHfjnNL6WuvrEwdsGMuVqrQFi1urRllKH8PGfeiuep3MrTkpLMvPZiD+2K+VSeptRxHqyY3ml8MRRpqltDatDKSD1RIQvTJOBgk8/oDxXP7QdZnv8AW3tkVUs0HSjTHfBPxH3zk8VI8PaZcRapaSmzI6C7/wCmP7mCOCDx3/c1baj4TuL0/e3gePottKHl2J53AfU1KmOkgnmF687AcTC21silvvEp6R+YbypP1GaaSawt5oCWsEETSRDpW4EituPO09wRjb5nse9U1z4OnSxRxax4bgLyW4qwsdDubfR7y2jEMEiBZUkjO1xtJHOR55wfy96W+tMMh2HOP2GsMcq0XepQkyus8RS5jcpID5kedFSI3ubwMbggjdlSy/Fz6miiGaJarJyIyvs21Oe9lOn3s0cwwSikAFT6D2pj9K1KbrpgsgwFUe1IHRLr+H3yXlnbyl41MjhCeFHdjjyA+laG58Ra1eONtrcW6lvhcwtgHt6etZmbCCFE1NSgeRjWvILMsFNxE3srgkfSqi8tNIgieTJRZVw+1yd49xmlY51eGYzASh5BtBMcg3dyfL/Ek/rUd7nXWcxy2l9IinbgxSY/2KeK7PbYie8o9Zmz1Gw8P7824YZPOBRWCnv5Y5GiuA8UiHBjcEFT6EHtRQCMPc67i/BKmDUpoA/RfZvQo/Y7lJBwc/kKl/zPqpYmS/uSSc5V1X/miimg44lY4PM9Q65exRYt7m6j+FB8MwHC/KPl8q8t4i1Ztyx6jPGpGGDyKc9xx8I9TRRR1GTSPkqrqVpJpJppxLJIxZ2zkknkmiiipBP/2Q=="),
        Film(
            title = "Mortadelo y Filemón",
            director = "Javier Fesser",
            year = 2020,
            photo = "data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAkGBwgHBgkIBwgKCgkLDRYPDQwMDRsUFRAWIB0iIiAdHx8kKDQsJCYxJx8fLT0tMTU3Ojo6Iys/RD84QzQ5OjcBCgoKDQwNGg8PGjclHyU3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3N//AABEIACQAJAMBEQACEQEDEQH/xAAXAAADAQAAAAAAAAAAAAAAAAAEBQYD/8QALhAAAgECBQMCBQQDAAAAAAAAAQIDBBEABRIhMSJBURNhBhRCcaEzcrHwFSMy/8QAGQEAAgMBAAAAAAAAAAAAAAAAAwQBAgUG/8QALREAAQMCAwYFBQEAAAAAAAAAAQIDEQAhBBJBBTFRYXGhEyKB4fAVkbHB0TL/2gAMAwEAAhEDEQA/AGc9NT0M3ytTT+rOFuPTDOGFtzxYbgjxjn8W5iQSUqhPGwi/Gj7PwuBUkZ0ysaSTPOOFCT/45GVZqUAAg6jTGzDjkDfv+MLNHHOAqbUT6j8TanH29mNKCHUpSehHeL0HLDlISFnjpY2ddREmpfpJtz5K/wBODJex2ZSQVGLWg6jl1qisJs7IhwhIBvcxp16VpAuT60WjifUzdIRHLFb3I/nngYkHaV83Dl859agN7JgZVDfxPHd80vSnMaOaerZ4qXQlgBdbE2G5t2ub7Y1sLmDQzmT9++tYmPCPHPhJgfbsau6+mqjTSiArLrUmTUQmnbnhr9/b2wpiMIrEFMGAOvtTeCxzeEC84knUAfulUcFa9NqNCXiCqn+ua+y2J+kc7X7eMBOzHUOZ0LEzO46/yj/WcM6zkW2opiNPasFmUs5ehd9FrnSnSNO+1+L9vfFPp+MSDlXBO/zG/vz4UT6hs1wpC0yBu8th7VpHJUMrrS0rFVS2q40qP3Dbntfzzgf015xWZxW/fvM/BWsX8Hhk5M4AHb030V8rBSIkTFYugHQGBt53HO998bQB0Fcc44kLPmnnxpxSz5j8u7RQ056irJIxUr5J9rYG4SLpomF8NUh6R0/FA0OZLFPIr08IUqwYpPdWPbbnCbj2JdSAgxzj+1qJ2Zg0GZPSl1KAa2sqoTEFmj0Kkax65SGuRccWsbgi4sNsHQ4pBBJk1d7CJeZyAQB29K1rKSZ5oKmlrFmoPTBlhQXs1vA78b84aZWF+YVj4hPhI8JxMHjFvv8AqtaSGpqoRPA6lJOq78n73F8XzoNJuMOtKKFC9MaKZny5UqmDM0Q9UEm1yLEXwBZSpEDeafw7Cg/mV/kGefpUJW5otNUzx19JLFIztDrIaTTY3J6rXsLm3g8cYWSFTFde40yWfFQsGdNaWivAjiqonq4oqdXaYukaxABukIf+nJsQe97CwwfJcggcuPOayEuEKuaoMhzrKquq0pUJBWRm0zCp1LIdOq6E7OOQQe/B74opnKZNulUK3HGyP9X3EDv/AHtVvl4ngpIx6ehmGthYXudzfSAL+ThgJEXNc+64srNh6bqlHrZ61sp1OIhNmJpnEShR6fpg2/OBsISEZq1H31qOXSKXHTUZvmdXKgMkEMsffr/TGpu5PV9thtiMs2NNlZCUhNvgo+ScPLR/DwgiTLq0IZ0UG7aiUPJ8AW99+cDWgIJUNKhqwil/wb8M5TV/FOZw1dKky0EKelqAFyLMC1rXPSB7i974uFqiocMARaava9FqTBNILM8Kk2474hdzQsP5ElI41//Z        "),
        Film(
            title = "Interestellar",
            director = "Cristopher Nolan",
            year = 2016,
            photo = "data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAkGBwgHBgkIBwgKCgkLDRYPDQwMDRsUFRAWIB0iIiAdHx8kKDQsJCYxJx8fLT0tMTU3Ojo6Iys/RD84QzQ5OjcBCgoKDQwNGg8PGjclHyU3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3N//AABEIADgAJgMBIgACEQEDEQH/xAAbAAACAwEBAQAAAAAAAAAAAAAABQMEBgcCAf/EADIQAAIBAwMBBAkDBQAAAAAAAAECAwAEEQUSIUExUWGRBhMUFUJxgaHwIiOxMlJzguH/xAAXAQEBAQEAAAAAAAAAAAAAAAABAAMC/8QAGBEBAQEBAQAAAAAAAAAAAAAAABESASH/2gAMAwEAAhEDEQA/ANpp1g8MjYSVldMq7NnJPh29BV0abtzDIxkWT4dg247e7zqaLUjxllP1q1c6nHbWrzz/ALaKhZiGOBjvFadrDhLJpyte3L+0RNOQchWUlQMYyOnUfICqk9rtG6cF33Yy2Mlj2dPE8DvxSjQFutE1e9vNSkt5bOaRgqQwkk73BJDZ7zjnu44roQt4HiSWJg2QCofu/mqxMDqFjqPrEmW3CSFdrMQCMfn8UVtbqdIAocJuPcKK6oSG0gXJYxgdckVR1gwy2ItwQ6yOqNgHKjqaQe+ba7DPNctFMP6QvA+vFMrKWK+tlM7NvznBOefzrRCW3IA1J4Z2UqxCyY/t6cZ7RnwrU2V/bppyswH7SAMFIJAHy8KyerSr7baXso2KziFuQeuVPy7eat3lpcjbBbWm2PgBwn6VHzFXfUv3t/acGCGaYk8oo5FFZy40aVWIhntNwPJ3GikL6WtqozLGCemF4qQXWj2Sh5Zo0K9BL+ryrjUvpPf3JMZuVCkZPrHODUPvC5llKPcadg5GHlwvXr/r9x30adZdAvNY0ifTxbDdv9pD9uMjr8TdCf8AlMLj0pt5HHq94H+Tbj6VhYdFnmUBtT0BcpuI9vGV4PTB/MU0g9DLyfaket6H6xnC5ilZmXkDOcePlmjRwfnWUnJBeEKp+NmY/avtcsXVpo2dXbcVYgntzRTRkst54o2LSpvIHC7cjxq8urW6LtWBlXrgAfYUUVw1e/e1sQCYzu6ccZ8qhl1G1lOfZwSOrqD5UUUIveRN7eqLKvQEY+fZRRRSH//Z"        ),
        Film(
            title = "Inazuma eleven",
            director = "Yoshikazu Miyao",
            year = 2010,
            photo = "data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAkGBwgHBgkIBwgKCgkLDRYPDQwMDRsUFRAWIB0iIiAdHx8kKDQsJCYxJx8fLT0tMTU3Ojo6Iys/RD84QzQ5OjcBCgoKDQwNGg8PGjclHyU3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3N//AABEIADgAJQMBIgACEQEDEQH/xAAbAAACAgMBAAAAAAAAAAAAAAAABQEEAgMGB//EADAQAAIBAgUCBQIFBQAAAAAAAAECAwQRAAUSITFBUQYTFCKBYXFCkaGx8TJDUmJy/8QAGQEAAwEBAQAAAAAAAAAAAAAAAQIEAwAF/8QAJhEAAgIBAgUEAwAAAAAAAAAAAQIAAxESIQQxQWGhUXHR8BMUIv/aAAwDAQACEQMRAD8A5f0dUa4JTlQWuXV2AHtF73+2GOR5nDKlH5tCiQyO04JSzzBRdQt+LsAO2JzGcUUErzGL1cVrLpaxB5tcW4B7jcYb5/4bn8S5fBmOXs9KaaFnplLXMrEDYDoCwG/TVxtuus4jAhsCLDndTLFU1eZUUIqY6pNN1BEMItYA9yWN/phfNLVZhU1ksQUK4Z4XayKy3F7dzb9cKqeGur6OWLMKq2py2hEHuPc98PaSsqBoo5onkgoIAgtKy2iNgSNrHbp3O+GRiMhuc7YMCnKbKGh0wAX+T1wYaUNVU1MROV09CyIdLyVDFtR/1AAIH33ODGTXIDgmZmwA7y5NAZpBSSRUI85tbMyASNbj/r8P72wVObZhk+VQxtTus0jNHH/igF+T24+euHUlF4irMny2p8HyxUrS1EyVbzkEkq5QHcGyexthvuPrg8ZjJZ86kyuAPTZpoWaVrExNf2i+/PuBJsLj64nRbFpHU85pUAWGo9p5PQyulY7BZpI42BkdEuRfkDaxx2cNZldXXUyMtLLHLGyhEhEenjY6m5I22PXrjOXw0+XUvm+fEq/30QNu5GwS/O9h+fbCxIos0WGSmg9DWepLn8R032vvbkfFhscP+d7CWYAY67eY9lKUrhT925RvFJFl6hUoKtAwAWOKMPoUbAFhz1535xGHNNMs6sY9Q0sVNwRuOcGPIfiTqOpd/eSEEmLK6aoqKmh9PnVXRR08jP5VPIAGtzqUNfhX91rWvhhnlXJnSNIUgpWl0prpoPMnkQbkE7k7b9h3OEj1E8m4mpViEelRJGS4NjcXA4N2HYXvuebMjVpofLq6yh1yqECGE6GQrpOoOpNuwsR3xSLOIACjBA79O/iUgVlR/WJkaDLENABW5i0qx6tEkTr5amwsdRtuLqCAB842SGgkJiWNRIy6ik5IaxF+W3BPS38YVtLViN5mzHK9SRiFNIezqSCSPaLkED73+m9eWurJGfVmEAAVVRo6QqQBawvq3A925A54wOI/Yd1ZgFI9DiaV2VVKRqzmXsgGbSJURzJCTE4FpnkDJdQdJIjIJF9/v2ticKjIsUKxQsP62kcpEsSl2PRV2tYLvz374jBYUk5Kb9s/MhLqDgEmacHJudycGDCSaRYYnBgwJ0AMGDBgwz//2Q=="        ),
        Film(
            title = "Detecctive Pikachu",
            director = "Rob Letterman",
            year = 2019,
            photo ="data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAkGBwgHBgkIBwgKCgkLDRYPDQwMDRsUFRAWIB0iIiAdHx8kKDQsJCYxJx8fLT0tMTU3Ojo6Iys/RD84QzQ5OjcBCgoKDQwNGg8PGjclHyU3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3N//AABEIADgAJgMBIgACEQEDEQH/xAAaAAADAAMBAAAAAAAAAAAAAAAABQYBAwQH/8QAMRAAAgEDAwMCBAMJAAAAAAAAAQIDAAQRBRIhMUFREyIGYYGRcbHxFBUyNUJSoaLw/8QAGQEBAQADAQAAAAAAAAAAAAAABAMBAgUA/8QAJhEAAgICAQEIAwAAAAAAAAAAAQIAAxEhBEETIkNRYZGh8BIUMf/aAAwDAQACEQMRAD8A8khULy8YkH9rEj8jW+Z4pkxDYQwEHJdHkJI8e5iP0rsa2CuIiORjnFb4dPmeRVRPx47V3OwBxic/tolMDYyBmumBUB/l8UxIwFZpOT59rD/jVVY2CbX9OwSa6XJY4Z1iRcFmCDliBzjPcdeheWmh3OokyanqVpEsYNvcLAUUxOdodRgAe1pSc8gEDOaJyeTxeOcWt7bPxLVpbZtRPM57CeABpY9uT07j5EdvrRVLrsMEN3dW9kwuBuhDtGQyqyQqrAEdfcW56cd6xSkrqsRXXWQDJs5Vipna9l6tx6xQBXUNhTuAXHY9/pTXTmg071bi5t1njWNisRONxxx+tLtF9aO4CDdIrsRCAei7ScD5cVc23w7ZTRpcZO5lzhu2evFbs6PSUfqMeu4Iq1bgjpEq69cX00UtnDbxSRRSRoZVyxV2Rj7RhQfYvnpSrUNO1a7ijfUL6WbOAXlPQdOB2zxnyRTnXJIPh6xub0xxSLGV5jHctjp5+tGp3LpocTFIDMNpDqT/AAsN2350Cvi8WlgK02Ov0xZ5FzjJbRk+BHowRYrQXLsCNxZjx8wCPA+9FaYGna5dkinmky4YRqWxgjt45FFXL2Z7uhIHj1eJsx3pNtHFLbyXgUFyQItoJ4XkHsc7qptCubcpKtzJKqLwH8BeMfjkjtULpmoSQNELsKRbyCSMBFxhl2njGSeB+B85q7+G5rO7uNQtWcbZVdo0Ye4k+/p2wB16cV58hceUT+tvJiD49udK1TQLuxs9UiOTEy7AWDEM2ckfIikeqa3avH+zRXls1uFjZWY42kLgikd/6X71uxclVjFw+1ggDbc+Qc/elVwSIjIs8oj3bTv94z455oi394yq8YKuB/I/bVZ7S4kmsLxYy5JJRc5zjP09orFSRJTJSO3YZ67cGikLeQJ56lY5IEpzqCPqDmF9wYIPaRtyB/nqaqNJnEFtPdf0LFtXjHuPBO4fbFYoo5dmYmODbkZf3cTX9wZWkEJkO3Ygz+dcMktjtA9edwrA49Ic/wC1FFYXDaIh2znOYuvpI5SPSG0ZyR4+9YoorX8QNTM//9k="),
        Film(
            title = "Harry Potter y El caliz de Fuego",
            director = "Mike Newell",
            year = 2005,
            photo ="data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAkGBwgHBgkIBwgKCgkLDRYPDQwMDRsUFRAWIB0iIiAdHx8kKDQsJCYxJx8fLT0tMTU3Ojo6Iys/RD84QzQ5OjcBCgoKDQwNGg8PGjclHyU3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3N//AABEIADgAJQMBIgACEQEDEQH/xAAbAAACAwEBAQAAAAAAAAAAAAAABgEEBQcDAv/EAC8QAAIBAwMCBAUEAwEAAAAAAAECAwAEEQUSITFBBhNRgRQiYXGhIzKRwUJysRX/xAAYAQADAQEAAAAAAAAAAAAAAAAAAgQDAf/EACARAAICAgICAwAAAAAAAAAAAAABAhEDIRIxBPAiUdH/2gAMAwEAAhEDEQA/AOf2nh6a6t1lW4iTdAJlDg4wZNmCe3r0NfV74XurS3kdpY3njEO6CNWZlMmeGPRcY69D69qa7JdUjsEEdi3mpbeUpeL5S3mZzxz+0n3+9Y2qXGpxLOZJLlbidQky+UoVgM85HfkjGO/XiquLJeaRTvfDJ+AsZtOE0k80UbyRSMv+WRkdOAwAxyTuHvWn8L6glyIYTFOCQNyuBgl2TGDz1U9PT6VblvJo57eS1kCGOzhh/VOdpUq/A/2wfY1J1W7Z4pRHArwzrJhnyrEO7DHoPnYdemKXiNyF2RPLlePcjbGK7kbcrYPUHuPrRXr8O0fyjB9Np3f8opqEs6X4m0ttU8QFr5rqKxG2G0W3kQEPt3bueACeOeePSrdhpV/rHh0NqEI+Ihmkiimk/dPGpwHI/n79aQ31PUo4Y2W9SRYghy53MdudoPfAycD605+H/G+oalaQW80UIlgwg8obYypwAXGeAMdu2T1xU0HPHkcn0Uz4ZMaiuyifC7B3DtGroNxC8nFUri20i2R/NuhvRSzIq7j+K3tT0YwM8N3qf6rHC+RGxUp125/OKUHWyS7FkkYMpSRZpGLYdc8fY4wR9RVc81LSJMeNSltmjewaJpjrHezzF3G7CRlsDqOg9CD70VuSaXpdzKZIy4KqsbPuILlVA5z39qKxXkZEqaVlEvHhbpnKfMIlABGcfbP3pm8I6xBot47XjP8AD3UBglKDJUcENjvjBHvS46IkTTEEuSu3HQda85t8bDDEvjnac4pVK7BxaY4/+7LqesXUkV3K9vK6MqkkAZGGwOwJB4rBnlE+oXN8sZ8sQmXZnkD5QAT7is+2laBWCHDHb/Oam4mJWAlucBTjjgYx+KJO0l72EI8W39/g2WHjQKJnntMNK+4KjZAG0D+qKTYX2oAe1Fd+L2wblZDybomXJwWQ/wAbh/YqJH+Qqp6YzRRWS0aPbJgkVTl1Ln6twam5m3hVwBg5wo4FTRQMtI8OTRRRQLZ//9k="),
        Film(
            title = "Del Reves (Inside Out)",
            director = "Pete Docter",
            year = 2015,
            photo ="data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAkGBwgHBgkIBwgKCgkLDRYPDQwMDRsUFRAWIB0iIiAdHx8kKDQsJCYxJx8fLT0tMTU3Ojo6Iys/RD84QzQ5OjcBCgoKDQwNGg8PGjclHyU3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3N//AABEIADgAJgMBIgACEQEDEQH/xAAbAAACAwEBAQAAAAAAAAAAAAAABwUGCAQDAv/EADUQAAIBAwMCAgcGBwEAAAAAAAECAwQFEQAGIRIxE2EHCBQiQVFxFYGCkdHwMkJDUqGxwSP/xAAXAQEBAQEAAAAAAAAAAAAAAAAAAgED/8QAIhEAAgIBAwQDAAAAAAAAAAAAAAECEQMEEiGxwdHwMVFx/9oADAMBAAIRAxEAPwB3SKzRkRsEb4MVzj7tRzSXCOMvIqADvnpAA+ff941wb83XT7P29Jcpk8WZiIqaDOPEkPYfQYJPkNZf3TuPcF/qRUX+qqWWYeLDEwKRBCSAUXtjgjPl31qdGNWaiS8rLL4aXKg6zgdAljJB+nVqQh+0JGUP0ovxbpU5/wA6zVYPR9UVuJqvpNPEQ0vhSKRIvchHGRnAOfkdRu1d933alWjW2sleiDc0U7l42X5Y+B8xj/mqlx9Erk1q4GNGona+4aPdFgpbtQZEUw95G/ijccMp+h/Pvo1BYpPWSkmkq9v0qk9BSZgM4BYlB+/rqr1NSJr3t6irnirJ6aDwpURVB90kcyfLAPA+XPJ4+vTLuKLcu8Wo451WhtgNPGw56n/qN+YA/Dn464LMttnuS3OtuDpWSSBW8FkXAOAzHPA46hq1ilki0jllyqEaZZ9uXGWX0lSUVppzS0QAWrp25VwOCxHmSMaq1i2VHdtyV9HVVi0dJBJMqyAZJZWKgAd8fM84+8amVkpobjcKj7XSEu+UdJSHfpPu+95YGB2IPw+HDPeLfbpakQGgro5Z3qEaojZ3WRuc8EDj9fPMZdJmiri+KS6+StNqMO/bO+3v6Xn1epZYJNx2nxOungmjlibGA2epS33hUOjXX6v9FUNa7ve6pizV1SsSHGB0xg8jyy5H4dGsV1ydZVue34K36xduoqK42WajpIIJJ45vFaKMKZCCmM479zpebRtVDdqypS41TU8UFOZciLrz7yqSR1LwobqPPZTrSu+9gWze/sbXKprIHpA4jNOygHqxnOVP9o0r7hsuy7B3jbC92qgk1LUSJLIqYVlABBHSQwKF+McnpGtJK7uv0fVtupYBR9E88TlJ1AWJfeC9ITPLnqDpjqYkgYGTjVZsG17rfNxR2KmppI6wv0zCRCPAUH3mf5AfoO5GmpLdVpxXtaoJpXqqkn2lJcIA3U/X4rqQxDgA4DKRg5JJ1Y/RDLTVV83FV0vsx8WKk8T2dgyhwJFIyAB/KDwAOe2gL5YbPS7fsdHaaFcQUsYQEjlj3LHzJyT5nRqRfto0B4RVEjSshgKqpwGLDkfPSV9YgVP21YJqSOR3hjkcFELYIZSP9aNGgFRdaq+3aTruHts3OQjI3SvGOB2HHGm96ukVTS0m4GNOwcvBhJMp1cP2yNGjQDijmnkz4sAiAPH/AKAk/lo0aNAf/9k="),
        Film(
            title = "Hércules",
            director = "Ron Clements, John Musker",
            year = 1997,
            photo ="data:image/jpeg;base64,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")
        )

    }
}
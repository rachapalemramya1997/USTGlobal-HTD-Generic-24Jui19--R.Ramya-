import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-bikes',
  templateUrl: './bikes.component.html',
  styleUrls: ['./bikes.component.css']
})
export class BikesComponent implements OnInit {
  bikeData:any='';
bikes = [
  {
    brand:'ktm',
    img:'https://cdn.pixabay.com/photo/2017/08/13/13/14/motorcycle-2637088__340.jpg',
    description:'KTM bike prices in India start at Rs 1.30 Lakh for KTM 125 Duke, which is the cheapest model. The most expensive KTM bike is the KTM 390 Duke priced at Rs 2.48 Lakh. The KTM 200 Duke (Rs 1.51 Lakh), KTM 125 Duke (Rs 1.30 Lakh), KTM 390 Duke (Rs 2.48 Lakh) are the most popular motorcycles from KTM.New bikes from KTM in 2019 include KTM RC 125 and KTM 125 Duke.New bikes from KTM in 2019 include KTM RC 125 and KTM 125 Duke. Upcoming KTM bikes in India include KTM 1050 Adventure, KTM 390 Adventure and KTM 790 Duke,which are expected to launch in 2019.Select a KTM bike model to find out its latest price, spec, offers, colours and more.'
  },
  {
    brand:'vespa',
    img:'https://image.shutterstock.com/image-photo/row-red-vespas-focus-on-260nw-552036496.jpg',
    description:'The most iconic scooter company in the world, Vespa, has made its Indian return. The Italian firm has been the most revered name in the world of scooters since its inception in 1940s. Over the years the Vespa brand has transformed from affordable transportation to a lifestyle product that carries a retro-modern	.'
  },
  {
    brand:'R15',
    img:'https://cdn.pixabay.com/photo/2014/12/16/03/37/motor-cycle-569865_960_720.jpg',
      description:'White and Orange seems to be a very good colour combination to look at, especially when it is on something that has wheels. And that was the colour of my ride in Goa. Usually Goa is associated with colour, style and flamboyance thanks to it is in. But this time my experience with my ride here was different. Riding the updated Hero Pleasure in Goa taught me that sometimes, it is better to do things the conventional way if you want accurate observations/reactions. Things I also learned that day were that if you are taller than the average man and ride something that is smaller than average, it surely gets some attention, but not necessarily for the right reasons'
  },
 
  {
    brand:'Royal Enfield',
    img:'https://cdn.pixabay.com/photo/2016/01/19/16/46/motorcycle-1149389__340.jpg',
    description:'The three scooters that the company is planning to bring in are - Django, Satelis 125 and Speedfight 3, all of which are already on sale in European markets. The Django 125cc scooter with its retro-styling will take on the Vespa LX 125'
  },
  {
    brand:'avenger',
    img:'https://cdn.pixabay.com/photo/2016/04/07/06/53/bmw-1313343__340.jpg',
    description:'Bajaj Avenger. ... Over the years, the motorcycle spawned numerous iterations and variants and now, with the introduction of the Avenger Street 160 ABS, Bajaj has a total of three bikes under the Avenger family. These include the Avenger Street & Cruise 220, and Avenger Street 160'
  },
]
  constructor() { }

  sendBike(bike){
this.bikeData=bike;
console.log(bike);
  }
  ngOnInit() {
  }

}

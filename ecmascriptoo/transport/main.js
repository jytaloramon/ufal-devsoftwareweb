const Air = require('./Air');
const Car = require('./Car');
const Motorcycle = require('./Motorcycle');


air = new Air(100, 'Querosene de Aviação', 800);
car = new Car('Volvo', 5, 'Gasolina', 240, 'Branco', 4, true);
motorcycle = new Motorcycle('Honda', 2, 'Gasolina', 140, 'Vermelho');

air.voar()

car.run()
motorcycle.run()

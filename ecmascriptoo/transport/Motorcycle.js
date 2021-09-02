const Terrestrial = require('./Terrestrial');

class Motorcycle extends Terrestrial {

    constructor(brand, passenger, typeFuel, velocityMax, color) {
        super(brand, passenger, typeFuel, velocityMax, color);
    };

    run() {

    };

}

module.exports = Motorcycle;
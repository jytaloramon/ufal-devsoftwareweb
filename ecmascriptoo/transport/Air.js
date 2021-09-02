const Vehicle = require("./Vehicle")


class Air extends Vehicle {

    constructor(passenger, typeFuel, velocityMax) {
        super(passenger, typeFuel, velocityMax);
    };

    voar() { };

}

module.exports = Air;
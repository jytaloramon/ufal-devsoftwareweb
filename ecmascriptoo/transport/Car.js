const Terrestrial = require('./Terrestrial');

class Car extends Terrestrial {

    constructor(brand, passenger, typeFuel, velocityMax, color, ports, hasAirbag) {
        super(brand, passenger, typeFuel, velocityMax, color);
        this._ports = ports;
        this._hasAirbag = hasAirbag;
    };

    getPorts() {
        return this._ports;
    };

    setPorts(ports) {
        this._ports = ports;
    };

    getHasAirbag() {
        return this._hasAirbag;
    };

    setHasAirbag(hasAirbag) {
        this._hasAirbag = hasAirbag;
    };

    run() {
        console.log('Ligar: carro');
    };

}

module.exports = Car;
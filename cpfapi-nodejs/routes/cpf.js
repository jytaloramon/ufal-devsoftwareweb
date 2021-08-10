var express = require('express');
var router = express.Router();
var cpfValidator = require('./../core/cpfValidator');
var data = require('./../core/data');

router.post('/check', (req, res, next) => {

    const cpf = req.body.cpf;
    const idxCpf = data.getIdxCpf(cpf);

    if (idxCpf !== -1)
        return res.json({ msg: 'CPF Já Existe' });

    const statusCpf =  cpfValidator(cpf) ? 'Válido' : 'Inválido';

    return res.json(data.addcpf(cpf, statusCpf));
});


router.get('/return', (req, res, next) => {

    return res.json(data.allCpf());
});

router.get('/return/:cpf', (req, res, next) => {

    const cpf = req.params.cpf;
    const dataCpf = data.findCpf(cpf);

    if (!cpf)
        return res.json({ msg: 'CPF Não Encontrado' })

    return res.json(dataCpf);
});


router.delete('/delete/:cpf', (req, res, next) => {

    const cpf = req.params.cpf;
    const dataCpf = data.deleteCpf(cpf);

    if (!dataCpf)
        return res.json({ msg: 'CPF Não Encontrado' });

    return res.json(dataCpf);
});


router.put('/return/:cpf', (req, res, next) => {

    const cpf = req.params.cpf;
    const desc = req.body.description;
    const dataCpf = data.alteDescCPF(cpf, desc);

    if (!dataCpf)
        return res.json({ msg: 'CPF Não Encontrado' })

    return res.json(dataCpf);
});

module.exports = router;

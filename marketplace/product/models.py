from django.db import models

# Create your models here.


class Product(models.Model):

    name = models.TextField(max_length=200, null=False)
    description = models.TextField(max_length=20, null=False)
    code = models.TextField(unique=True, max_length=13, null=False)
    price = models.DecimalField(max_digits=10, decimal_places=2, null=False)
    stock = models.IntegerField(null=False)

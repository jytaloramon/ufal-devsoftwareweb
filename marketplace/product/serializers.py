from rest_framework import serializers
from product.models import Product
import random


class ProductSerializer(serializers.Serializer):

    id = serializers.IntegerField(read_only=True)
    name = serializers.CharField(max_length=200)
    description = serializers.CharField(max_length=20)
    code = serializers.CharField(max_length=13)
    price = serializers.DecimalField(max_digits=10, decimal_places=2)
    stock = serializers.IntegerField()

    def create(self, validated_data):
        return Product.objects.create(**validated_data)

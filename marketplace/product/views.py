from rest_framework.viewsets import ModelViewSet
from rest_framework.response import Response
from rest_framework.request import Request
from product.models import Product
from product.serializers import ProductSerializer
from rest_framework.parsers import JSONParser
from django.core import serializers

# Create your views here.
import json


class ProductViewSet(ModelViewSet):

    queryset = Product.objects.all()
    serializer_class = ProductSerializer

    parser_classes = [JSONParser]

    def update(self, request, *args, **kwargs):
        product = self.get_object()
        product.price = request.data['price']
        product.stock = request.data['stock']
        product.save()

        return Response(serializers.serialize('json', [product]), content_type='application/json')

    def destroy(self, request, *args, **kwargs):
        product = self.get_object()
        product.delete()

        return Response({'message': "Item deleted",
                         'data': {'name': product.name, 'code': product.code}})
